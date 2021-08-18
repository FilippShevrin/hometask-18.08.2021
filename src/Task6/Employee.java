package Task6;

public class Employee extends Arhiv {

        String subject;
        String name;
        int numberOfItems;

        public Employee(String subject, String name, int numberOfItems) {
            this.subject = subject;
            this.name = name;
            this.numberOfItems = numberOfItems;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfItems() {
            return numberOfItems;
        }

        public void setNumberOfItems(int numberOfItems) {
            this.numberOfItems = numberOfItems;
        }
    }



