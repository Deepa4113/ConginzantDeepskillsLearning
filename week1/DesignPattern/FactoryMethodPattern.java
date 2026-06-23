package week1.DesignPattern;
interface document
{
    void create();
}
class pdfDocument implements document
{
    public void create()
    {
        System.out.println("Creating PDF document");
    }
}
class wordDocument implements document
{
    public void create()
    {
        System.out.println("Creating Word document");
    }
}
class excelDocument implements document
{
    public void create()
    {
        System.out.println("Creating Excel document");
    }
}
interface documentFactory
{
    document createDocument();
}
class pdfDocumentFactory implements documentFactory
{
    public document createDocument()
    {
        return new pdfDocument();
    }
}
class wordDocumentFactory implements documentFactory
{
    public document createDocument()
    {
        return new wordDocument();
    }
}
class excelDocumentFactory implements documentFactory
{
    public document createDocument()
    {
        return new excelDocument();
    }
}
public class FactoryMethodPattern {
    public static void main(String[] args)
    {
        documentFactory factory = new pdfDocumentFactory();
        document doc = factory.createDocument();
        doc.create();
            factory = new wordDocumentFactory();
            doc = factory.createDocument();
            doc.create();
            factory = new excelDocumentFactory();
            doc = factory.createDocument();
            doc.create();
    }
}
