package so.scheduler;

import java.util.LinkedList;
import java.util.Queue;

import so.process.SoProcess;
import so.process.SubProcess;
import so.systemSo.SystemCallType;
import so.systemSo.SystemOperation;

public class SchedulerQueue extends Scheduler {
    protected Queue<SoProcess> processQueue;
    protected LinkedList<SubProcess> subProcessQueue; // Fila de processos
   
    public SchedulerQueue() {
        super();
        this.processQueue = new LinkedList<>();
        this.subProcessQueue = new LinkedList<>();
    }

    @Override
    public void add(SoProcess p) {
        processQueue.add(p);
        for (SubProcess subProcess : SystemOperation.systemCall(SystemCallType.READ_PROCESS, p)) {
            subProcessQueue.add(subProcess);
        }
        if (!subProcessQueue.isEmpty()) {
            System.out.println("Fila de processos após adicionar os processos: \n" + processQueue.toString());
        } else {
            System.out.println("Fila de processos esta vazia.");
        }
    }

    @Override
    public void finish(SoProcess p) {
        processQueue.remove(p);
    }

    @Override
    public boolean isEmpty() {
        return processQueue.isEmpty();
    }

	@Override
	public SubProcess execute() {
		return null;
		
	}
}
