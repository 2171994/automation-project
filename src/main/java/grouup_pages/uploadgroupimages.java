package grouup_pages;
import org.openqa.selenium.Alert;
/*
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
*/
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;

public class uploadgroupimages extends Base1_page {

	public uploadgroupimages(WebDriver driver2) {
		super(driver2);
	}
	
	    @FindBy(id = "image-input")
	    private WebElement fileUploader;

	    
	    
	    ////*[@id="inputGroupName"]/div/div/div
	//    @FindBy(xpath = "//*[@id=\"inputGroupName\"]/app-modal-container/div/div/div[3]/div/label")
	 //   private WebElement uploadImageButton;
	    
	    
	    @FindBy(xpath = "//*[@id=\"inputGroupName\"]/app-modal-container/div/div")
	    private WebElement cropcontainer;
	    
	    
	    @FindBy(xpath = "/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chat-form/div/form/div[1]/div[2]/div[1]/app-abstract-item-form/label/div/div[2]/app-upld-img-with-title/app-modal-container/div/div/app-form-frame/div/div[3]/button" )
	    private WebElement confirmuploadimage;

		//private int currentImageIndex;

	    // Starting index for the images

	    // ...

	//    public void uploadImage() throws InterruptedException {
	//    	String relativeImagePath = "uploadImages/image" + currentImageIndex + ".png";
	//        String absoluteImagePath = System.getProperty("user.dir") + File.separator + relativeImagePath;
	    //    String imagePath = "uploadImage1/image" + currentImageIndex + ".png";
	 //       fileUploader.sendKeys(absoluteImagePath);
	 //       Thread.sleep(3000);
	  //      uploadImageButton.click();
	        // Handle synchronization or validation here after clicking the upload button

	//        currentImageIndex++; // Increment the image index for the next upload
	//    }
	    
	    
	    Actions actions = new Actions(new_driver);
	    public void uploadImage(String imageName) throws InterruptedException {
	//    int	 currentImageIndex = 1; 
	    //	String imageName = "image1.png" ;
	        String relativeImagePath =System.getProperty("user.dir")+ "/uploadImage1/"+imageName ;
	//        Path absoluteImagePath = Paths.get(System.getProperty("user.dir"), relativeImagePath);

	        fileUploader.sendKeys(relativeImagePath);
	        Thread.sleep(3000);
	        
	       // uploadImageButton.click();
	        Thread.sleep(3000);
	        confirmuploadimage.click();
	        Thread.sleep(2000);
	       //    new_driver.switchTo().frame(cropcontainer);
			//   actions.click(confirmuploadimage).click(confirmuploadimage).build().perform() ;
	      
	  
	        // Handle synchronization or validation here after clicking the upload button

	   //     currentImageIndex++; // Increment the image index for the next upload
	    
	    
	    }
	    
	}
		// TODO Auto-generated constructor stub
		
	//	WebElement fileUploader = new_driver.findElement (By.id("image-input"));
		/*
		
	}
	@FindBy(id="image-input")
	private	WebElement fileUploader ;
	
	
	
	private int imageIndex;
	@FindBy(xpath="//*[@id=\"inputGroupName\"]/app-modal-container/div/div/div[3]/div/label")
	private	WebElement upload_image_button ;
	
	String imagePaths = System.getProperty("user.dir") +"/uploadimage1/"+imageIndex;
//	String imagePaths = System.getProperty("user.dir") +"/uploadimage2/"+imageIndex;
	
	
	
    public void uploadImage(List<String> imagePaths) throws InterruptedException {
    	 imageIndex = 0;
    	String  imagePath = imagePaths.get(imageIndex) ;
        fileUploader.sendKeys(imagePath);
        Thread.sleep(3000);
  //      wait_elements (new_driver , 50 ,  upload_image_button  );
        upload_image_button.click();
        // Code to handle the image upload, e.g., click on the upload button or wait for upload completion
        // Add any necessary synchronization or validation code here
        imageIndex++;
    }
}

*/

  //  private WebElement uploadButton;

  //  private int imageIndex;

  //  public UploadPage(WebDriver driver) {
    //    super(driver);
     //   imageIndex = 0;
   // }

  //  public void uploadImage(List<String> imagePaths) {
  //      String imagePath = imagePaths.get(imageIndex);
    //    uploadButton.sendKeys(imagePath);
        // Code to handle the image upload, e.g., click on the upload button or wait for upload completion
        // Add any necessary synchronization or validation code here
   //     imageIndex++;
    //}
    
    
//}

//String imageName = "mosalah.png" ;
//String imagePath = System.getProperty("user.dir") +"/uploadimage1/"+imageName;
//WebElement fileUploader = new_driver.findElement (By.id("image-input"));
//     //*[@id="inputGroupName"]/div/div/div/label[1]
//fileUploader.sendKeys(imagePath); 
/*
Thread.sleep(3000);
wait_elements (new_driver , 50 ,  upload_image_button  );
new_driver.findElement(upload_image_button).click();
*/

	