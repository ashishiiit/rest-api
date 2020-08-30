API_URL : http://localhost:8080/RestAPiDemo/myresource/101
 
Steps To Create Custom Exception:

1. Create One New Class which extends Runtime Exception.
   
   Ex.
    
      public class DataNotFoundException extends RuntimeException{
        public static final long serialVersionUID = 1L;
        
        //create one constructor and pass msg.
        public DataNotFoundException(String message){
    	  super(message);
        }

     }
     
 2. Create One Class which implements ExceptionMapper interface and override toResponse() method of ExceptionMapper interface.
    here in Response we have to return status and msg.
    
    Ex.
   @Provider
   public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException ex) {
		int ERROR_CODE = 400;
		ErrorMessage message= new ErrorMessage(ERROR_CODE, ex.getMessage());
		return Response.status(Status.NOT_FOUND).entity(message).build();
	}
   }
    
    //here we are sending status 400 but this class did not throw expected msg. to throw expected msg we need to crerate one more class with some variable.  
    
    @XmlRootElement
public class ErrorMessage {
	private int errorCode;
	private String errorMessgae;

	//when you create constructor with arguments then you must need to also create constructor with no-args.
	public ErrorMessage() {
	}

	public ErrorMessage(int errorCode, String errorMessgae) {
		super();
		this.errorCode = errorCode;
		this.errorMessgae = errorMessgae;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessgae() {
		return errorMessgae;
	}

	public void setErrorMessgae(String errorMessgae) {
		this.errorMessgae = errorMessgae;
	}

}
    
