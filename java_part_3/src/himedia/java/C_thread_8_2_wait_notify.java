package himedia.java;

// wait()과 notify()
// synchronized로 동기화해서 공유데이터를 보호하는 것 까지는 좋은데
// 특정 스레드가 객체의 락을 가진 상태로 오핸 시간을 보내지 않도록 하는 것도 중요하다.
// 만일 계좌에 출금할 돈이 부족해서 한 그레드가 학을 보유한 태로 돈이 임금 될떄까지 오핸 시간을 보낸다면
// 다른 스레드들은 모두 해당 객채의 락을 기다리느라 다른 작업을 원활히 진행되지 않을 것이다.

// 이러한 상활을 개선하기 위해 고안된 것이 바로 wait()과 notify()이다.
// 동가화된 임꼐 영역의 코드를 수행하다가 작업을 더 이상 진행할 상황이 아니면
// 일단 wait()을 호출하여 스레드가 락을 반남하고 기다리게 한다.
// 그러면 다른 스레드가 락을 얻어 해당 객체에 대한 작업을 수행할 수 있게 된다.
// 나중에 작업을 진행할 수 있는 상황이 되면 notify()을 호출해서
// 작업을 중단해서 스레드가 다시 락을 얻어 작업을 진행할 수 있게된다.

// 오래 기다린 스레드가 락을 얻는다는 보장이 없다.
// wait()이 호출되면 실행 중이던 스레드는 해당 객체의 대기실(waiting pool)에서 통지를 기다린다.
// notify()가 호출되면 해당 객체의 대기실에 있던 모든 스레드 중에서 임의의 스레드만 통지를 받는다.
// notifyAll()은 기다리고 있ㄴ느 모든 스레드에게 통보를 하지만
// 그래도 lock을 얻을 수 있는 것은 하나의 스레드일 뿐이고
// 나머지 스레드는 통보를 받긴 했지만 lock을 얻지 못하면 다시 lock을 기다리게된다.

// wait()은 notify() 또는 NotifyAll()이 호출 될떄까지 기다리지만
// 매개변수가 있는 wait()은 지정된 시간동안 기다린다.
// 즉 지정된 시간이 지난 후에 자동적으로 notify()가 호출되는것과 같다.
// waiting pool은 객체마다 존재하는 것이므로 notifyAll()이 호출된다고 해서
// 모든 객체의 waiting pool에 있는 스레드가 깨어지는 것이 아니다.
// notifyAll()이 호출된 객체의 waiting pool에 대기중인 스레드만 해당된다.

// wait()과 notify() 메서드를 사용하려면 반드시 synchronized 블록(또는 메서드) 안에서 호출해야 한다.

class Chat {
    private boolean flag = false;

    // 질문하는 메서드
    public synchronized void question(String msg) {
        while (flag) {
            try{
                wait();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("Question : " + msg);
            flag = true;
            notify();
        }
    }

    // 답변하는 메서드
    public synchronized void answer(String msg) {
        while (!flag) {
            try{
                wait();

            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Answer : " + msg);
        flag = false;
        notify();
    }
}
class QuestionThread extends Thread {
    private Chat chat;
    private String[] questions = { "hi", "how r u", "what r u doin"};

    public QuestionThread(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String question : questions) {
            chat.question(question);
        }
    }
}
class AnswerThread extends Thread {
    private Chat chat;
    private String[] answers = { "hola", "im good thanks", "im doing something"};

    public AnswerThread(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void run() {
        for (String answer : answers) {
            chat.answer(answer);
        }
    }
}

public class C_thread_8_2_wait_notify {
    public static void main(String[] args) {
        Chat chat = new Chat();

        QuestionThread qt = new QuestionThread(chat);
        AnswerThread at = new AnswerThread(chat);

        qt.start();
        at.start();

    }
}
