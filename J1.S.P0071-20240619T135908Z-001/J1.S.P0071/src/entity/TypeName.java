package entity;

public enum TypeName {

        Code, Test, Design, Review;
        @Override
        public String toString() {
            switch (this) {
                case Code:
                    return "Code";
                case Test:
                    return "Test";
                case Design:
                    return "Design";
                case Review:
                    return "Review";
                default:
                    throw new UnsupportedOperationException();
            }
        }
}
