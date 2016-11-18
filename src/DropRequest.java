public class DropRequest extends Request {
    private DropRequest(String course, String studentID) {
        createRequest(REQUEST_DROP,studentID,course);
    }
}
