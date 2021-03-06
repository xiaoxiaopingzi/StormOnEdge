package StormOnEdge.scheduler;

import java.util.ArrayList;
import java.util.List;

import backtype.storm.scheduler.SupervisorDetails;
import backtype.storm.scheduler.WorkerSlot;

public class CloudAssignment {

  private final String name;
  private final List<SupervisorDetails> supervisors;
  private final List<WorkerSlot> workers;
  private final List<WorkerSlot> selectedWorkers;

  private final List<Integer> tasks;

  public CloudAssignment(String n) {
    name = n;

    supervisors = new ArrayList<SupervisorDetails>();
    workers = new ArrayList<WorkerSlot>();
    selectedWorkers = new ArrayList<WorkerSlot>();
    tasks = new ArrayList<Integer>();
  }

  @Override
  public String toString() {
    return name;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the supervisors
   */
  public List<SupervisorDetails> getSupervisors() {
    return supervisors;
  }

  public void addSupervisor(SupervisorDetails sup) {
    supervisors.add(sup);
  }

  /**
   * @return the workers
   */
  public List<WorkerSlot> getWorkers() {
    return workers;
  }

  public void addWorker(WorkerSlot worker) {
    workers.add(worker);
    selectedWorkers.add(worker);
  }

  public void addWorkers(List<WorkerSlot> works) {
    workers.addAll(works);
    selectedWorkers.add(works.get(0));
  }

  /**
   * @return selectedWorkers
   */
  public List<WorkerSlot> getSelectedWorkers() {
    return selectedWorkers;
  }

  /**
   * @return the tasks
   */
  public List<Integer> getTasks() {
    return tasks;
  }

  public void addTask(Integer T) {
    tasks.add(T);
  }

  public void addTasks(List<Integer> Ts) {
    tasks.addAll(Ts);
  }

}
