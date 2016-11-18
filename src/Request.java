/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    public static IRequest createRequest(int type, String studentID, String courseID) {
        return null;
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return null;
    }

    @Override
    public String setStudentID(String studentID) {
        return null;
    }

    @Override
    public String getCourseID() {
        return null;
    }

    @Override
    public void setCourseID(String courseID) {

    }

    @Override
    public int getRequestType() {
        return 0;
    }
}
