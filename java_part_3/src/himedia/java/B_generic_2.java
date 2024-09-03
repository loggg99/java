package himedia.java;

public class B_generic_2<T extends Number> {

    // 덧셈
    public T add(T num1,T num2) {
        if ( num1 instanceof Integer) {
            return (T) Integer.valueOf( num1.intValue() + num2.intValue());

        }else if ( num1 instanceof Double) {
            return (T) Double.valueOf( num1.doubleValue() + num2.doubleValue());
        }
        throw new UnsupportedOperationException("지원되지 않는 타입");
    }

    // 뺼셈
    public T sub(T num1,T num2) {
        if ( num1 instanceof Integer) {
            return (T) Integer.valueOf( num1.intValue() - num2.intValue());
        }else if ( num1 instanceof Double) {
            return (T) Double.valueOf( num1.doubleValue() - num2.doubleValue());
        }
        throw new UnsupportedOperationException("지원 되지 않는 타입");
    }

    //곱셈
    public T mul(T num1,T num2) {
        if ( num1 instanceof Integer) {
            return (T) Integer.valueOf( num1.intValue() * num2.intValue());
        }else if ( num1 instanceof Double) {
            return (T) Double.valueOf( num1.doubleValue() * num2.doubleValue());
        }
        throw new UnsupportedOperationException("지원되지 않는 타입");
    }

    // 나눗셈
    public T div(T num1,T num2) {
        if ( num1 instanceof Integer) {
            return (T) Integer.valueOf(num1.intValue() / num2.intValue());

        }else if ( num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        }
        throw new UnsupportedOperationException("지원되지 않는 타입");
    }

    public static void main(String[] args) {

    }

}
