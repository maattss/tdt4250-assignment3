package tdt4250.studyplan.html;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.w3c.xhtml1.HtmlType;
import org.w3c.xhtml1.Xhtml1Factory;
import org.w3c.xhtml1.util.Xhtml1ResourceFactoryImpl;
import studyplan.Department;
import tdt4250.studyplan.html.XhtmlUtil;

@SuppressWarnings("all")
public class Plan2Xhtmlgenerator {
  private Xhtml1ResourceFactoryImpl xhtml1ResourceFactoryImpl = new Xhtml1ResourceFactoryImpl();
  
  public String generateHtml(final Department department) {
    try {
      String _xblockexpression = null;
      {
        final String encoding = "UTF-8";
        final HtmlType html = this.generateHtmlType(department);
        String _xifexpression = null;
        String _name = department.getName();
        boolean _tripleNotEquals = (_name != null);
        if (_tripleNotEquals) {
          _xifexpression = department.getName().replace(".", "/");
        } else {
          _xifexpression = "department";
        }
        final String fileName = (_xifexpression + ".html");
        Resource _createResource = this.xhtml1ResourceFactoryImpl.createResource(URI.createFileURI(fileName));
        final XMLResource resource = ((XMLResource) _createResource);
        resource.getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, encoding);
        EList<EObject> _contents = resource.getContents();
        _contents.add(html);
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream(4096);
        resource.save(outputStream, null);
        final String originalOutput = outputStream.toString(encoding);
        _xblockexpression = this.cleanHtml(originalOutput);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String cleanHtml(final String html) {
    return html.replace("xhtml:", "").replace("html_._type", "html").replace("xmlns:xhtml=", "xmlns=").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&").replace("&quot;", "\'");
  }
  
  @Extension
  private Xhtml1Factory xhtml1Factory = Xhtml1Factory.eINSTANCE;
  
  @Extension
  private XhtmlUtil xhtmlUtil = new XhtmlUtil();
  
  public HtmlType generateHtmlType(final Department department) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generate(Program) is undefined"
      + "\nThe method generateCheckFunction(Program) is undefined");
  }
  
  public static void main(final String[] args) throws IOException {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot make a static reference to the non-static method generateHtml from the type Plan2Xhtmlgenerator"
      + "\nInvalid number of arguments. The method generateHtml(Department) is not applicable for the arguments (Plan2XhtmlGeneratorMain,Quiz)"
      + "\nType mismatch: cannot convert from Plan2XhtmlGeneratorMain to Department"
      + "\nThe method getQuiz(String) from the type Plan2Xhtmlgenerator refers to the missing type Quiz"
      + "\nThe method getSampleQuiz() from the type Plan2Xhtmlgenerator refers to the missing type Quiz"
      + "\neResource cannot be resolved"
      + "\ngetResourceSet cannot be resolved"
      + "\ngetURIConverter cannot be resolved"
      + "\ncreateOutputStream cannot be resolved");
  }
  
  public static /* Quiz */Object getQuiz(final String uriString) throws IOException {
    throw new Error("Unresolved compilation problems:"
      + "\nQuiz cannot be resolved to a type."
      + "\nQuiz cannot be resolved to a type."
      + "\nThe method or field QuizPackage is undefined"
      + "\nThe method or field QuizPackage is undefined"
      + "\nQuizResourceFactoryImpl cannot be resolved."
      + "\neNS_URI cannot be resolved"
      + "\neINSTANCE cannot be resolved");
  }
  
  public static /* Quiz */Object getSampleQuiz() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field Quiz2XhtmlGeneratorMain is undefined"
      + "\nThe method getQuiz(String) from the type Plan2Xhtmlgenerator refers to the missing type Quiz"
      + "\ngetResource cannot be resolved"
      + "\ntoString cannot be resolved");
  }
}
