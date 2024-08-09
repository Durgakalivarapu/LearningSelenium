package com.Amokart.generic.pagerepository;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class RegisterPage {

		//1. Address of name textfield
		@FindBy(id="name")
		private WebElement nameTextField;
		
		//Address of name label
		@FindBy(xpath="//label[text()='Name:']")
		private WebElement nameLabel;
		
		// 2.Address of email textfield
			@FindBy(id="email")
		private WebElement emailTextField;
		
		//Address of email label
			@FindBy(xpath="//label[text()='Email:']']")
	    private WebElement emailLabel;
		
		// 3.Address of password textfield
			@FindBy(id="password")
		private WebElement pwdTextField;
				
		//Address of password label
			@FindBy(xpath="//label[text()='Password:']")
	    private WebElement pwdLabel;
			
		// 4.Address of mobile textfield
			@FindBy(id="mobile")
		private WebElement mobTextField;
						
		//Address of mobile label
		    @FindBy(xpath="//label[text()='Mobile.no:']")
		private WebElement mobLabel;
		    
		 // 5.Address of dob textfield
		 		@FindBy(name="dob")
		private WebElement dobTextField;
		 	
		  //adress of dob label
		 		 @FindBy(xpath="//label[text()='DOB:']")
		private WebElement dobLabel;
		 	 
		 		
			 	
			//6. address of dob label
			  @FindBy(xpath="//label[text()='Gender:']")
	    private WebElement genderLabel;
			 		 
			// Address of male radio button
				 @FindBy(id="male")
	    private WebElement maleRadioButton;
			
			// Address of Female radio button
				@FindBy(id="female")
	    private WebElement femaleRadioButton;
				 	
			// Address of others radio button
				 @FindBy(id="others")
	    private WebElement otherRadioButton;
			
				 
			//7. Address of placed label
				  @FindBy(xpath="//label[text()='Places:']")
		private WebElement placesrLabel;
				 		  	
				 	
			// Address of goa check box
				 @FindBy(id="goa")
		private WebElement goaCheckbox;
				 
				// Address of manali check box
				 @FindBy(id="manali")
		private WebElement manaliCheckbox;
				 
				 
				// Address of bangalore check box
				 @FindBy(id="bangalore")
		private WebElement bangaloreCheckbox;
				 
				// Address of kerala check box
				 @FindBy(id="Kerala")
		private WebElement KeralaCheckbox;
				 
				//8. Address of country label
				  @FindBy(xpath="//label[text()='Country:']")
		private WebElement countryLabel;
		 		 
				// Address of country dropdown
					 @FindBy(name="country1")
		private WebElement countryDropDown;
					 
				// Address of country dragdrop
					 @FindBy(name="country2")
	    private WebElement countryDragdrop;
					 
					 
				/**
					 * @return the nameTextField
					 */
					public WebElement getNameTextField() {
						return nameTextField;
					}

					/**
					 * @return the nameLabel
					 */
					public WebElement getNameLabel() {
						return nameLabel;
					}

					/**
					 * @return the emailTextField
					 */
					public WebElement getEmailTextField() {
						return emailTextField;
					}

					/**
					 * @return the emailLabel
					 */
					public WebElement getEmailLabel() {
						return emailLabel;
					}

					/**
					 * @return the pwdTextField
					 */
					public WebElement getPwdTextField() {
						return pwdTextField;
					}

					/**
					 * @return the pwdLabel
					 */
					public WebElement getPwdLabel() {
						return pwdLabel;
					}

					/**
					 * @return the mobTextField
					 */
					public WebElement getMobTextField() {
						return mobTextField;
					}

					/**
					 * @return the mobLabel
					 */
					public WebElement getMobLabel() {
						return mobLabel;
					}

					/**
					 * @return the dobTextField
					 */
					public WebElement getDobTextField() {
						return dobTextField;
					}

					/**
					 * @return the dobLabel
					 */
					public WebElement getDobLabel() {
						return dobLabel;
					}

					/**
					 * @return the genderLabel
					 */
					public WebElement getGenderLabel() {
						return genderLabel;
					}

					/**
					 * @return the maleRadioButton
					 */
					public WebElement getMaleRadioButton() {
						return maleRadioButton;
					}

					/**
					 * @return the femaleRadioButton
					 */
					public WebElement getFemaleRadioButton() {
						return femaleRadioButton;
					}

					/**
					 * @return the otherRadioButton
					 */
					public WebElement getOtherRadioButton() {
						return otherRadioButton;
					}

					/**
					 * @return the placesrLabel
					 */
					public WebElement getPlacesrLabel() {
						return placesrLabel;
					}

					/**
					 * @return the goaCheckbox
					 */
					public WebElement getGoaCheckbox() {
						return goaCheckbox;
					}

					/**
					 * @return the manaliCheckbox
					 */
					public WebElement getManaliCheckbox() {
						return manaliCheckbox;
					}

					/**
					 * @return the bangaloreCheckbox
					 */
					public WebElement getBangaloreCheckbox() {
						return bangaloreCheckbox;
					}

					/**
					 * @return the keralaCheckbox
					 */
					public WebElement getKeralaCheckbox() {
						return KeralaCheckbox;
					}

					/**
					 * @return the countryLabel
					 */
					public WebElement getCountryLabel() {
						return countryLabel;
					}

					/**
					 * @return the countryDropDown
					 */
					public WebElement getCountryDropDown() {
						return countryDropDown;
					}

					/**
					 * @return the countryDragdrop
					 */
					public WebElement getCountryDragdrop() {
						return countryDragdrop;
					}

					/**
					 * @return the feedbackLabel
					 */
					public WebElement getFeedbackLabel() {
						return feedbackLabel;
					}

					/**
					 * @return the feedbackTextfield
					 */
					public WebElement getFeedbackTextfield() {
						return feedbackTextfield;
					}

					/**
					 * @return the uploadLabel
					 */
					public WebElement getUploadLabel() {
						return uploadLabel;
					}

					/**
					 * @return the photoButton
					 */
					public WebElement getPhotoButton() {
						return photoButton;
					}

					//9. Address of feedback label
					 @FindBy(xpath="//label[text()='Feedback:']")
					 WebElement feedbackLabel;
					  
						 
				// Address of feedback field
					 @FindBy(id="feedback")
					 WebElement feedbackTextfield;
						  
					 
				//10. Address of Upload your ID: label
							 @FindBy(xpath="//label[text()='Upload your ID:']")
							 WebElement uploadLabel;	
			
				// Address of choose photo button
					 @FindBy(name="photo")
					 WebElement photoButton;	
					 
					 
					 
			
						  
						  
					  
		 }
