DROP TABLE LOANS;
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);
CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE
);
INSERT INTO Customers VALUES (1,'Deepa',65,15000,'FALSE');
INSERT INTO Customers VALUES (2,'Ravi',45,8000,'FALSE');
INSERT INTO Loans VALUES (101,1,8,SYSDATE+10);
INSERT INTO Loans VALUES (102,2,9,SYSDATE+40);

COMMIT;


 SET SERVEROUTPUT ON;

BEGIN

   /* Scenario 1*/
   FOR cust IN (
      SELECT CUSTOMERID, AGE
      FROM CUSTOMERS
   )
   LOOP
      IF cust.AGE > 60 THEN
         UPDATE LOANS
         SET INTERESTRATE = INTERESTRATE - 1
         WHERE CUSTOMERID = cust.CUSTOMERID;
      END IF;
   END LOOP;

   DBMS_OUTPUT.PUT_LINE('Interest rate discount applied.');

   /* Scenario 2*/
   FOR cust IN (
      SELECT CUSTOMERID, BALANCE
      FROM CUSTOMERS
   )
   LOOP
      IF cust.BALANCE > 10000 THEN
         UPDATE CUSTOMERS
         SET ISVIP = 'TRUE'
         WHERE CUSTOMERID = cust.CUSTOMERID;
      END IF;
   END LOOP;

   DBMS_OUTPUT.PUT_LINE('VIP status updated.');

   /* Scenario 3*/
   FOR loan_rec IN (
      SELECT c.CUSTOMERNAME,
             l.LOANID,
             l.DUEDATE
      FROM CUSTOMERS c
      JOIN LOANS l
      ON c.CUSTOMERID = l.CUSTOMERID
      WHERE l.DUEDATE BETWEEN SYSDATE AND SYSDATE + 30
   )
   LOOP
      DBMS_OUTPUT.PUT_LINE(
         'Reminder: Dear ' ||
         loan_rec.CUSTOMERNAME ||
         ', your Loan ID ' ||
         loan_rec.LOANID ||
         ' is due on ' ||
         TO_CHAR(loan_rec.DUEDATE, 'DD-MON-YYYY')
      );
   END LOOP;

   COMMIT;

   DBMS_OUTPUT.PUT_LINE('All operations completed successfully.');

END;
/
--
--SELECT * FROM CUSTOMERS;

--SELECT * FROM LOANS;
SELECT c.CUSTOMERNAME,
       l.LOANID,
       l.DUEDATE
FROM CUSTOMERS c
JOIN LOANS l
ON c.CUSTOMERID = l.CUSTOMERID
WHERE l.DUEDATE BETWEEN SYSDATE AND SYSDATE + 30;