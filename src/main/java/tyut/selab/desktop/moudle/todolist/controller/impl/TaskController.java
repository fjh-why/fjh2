package tyut.selab.desktop.moudle.todolist.controller.impl;

import tyut.selab.desktop.moudle.todolist.controller.ITaskController;
import tyut.selab.desktop.moudle.todolist.domain.vo.TaskVo;

import java.util.List;

public class TaskController implements ITaskController {
    @Override
    public List<TaskVo> queryAllTask(Integer studentNumber) {
        return null;
    }

    @Override
    public List<TaskVo> queryAllTaskByUserName(String name) {
        return null;
    }

    @Override
    public int insertTask(TaskVo task) {
        return 0;
    }

    @Override
    public int updateTask(TaskVo task) {
        return 0;
    }

    @Override
    public int deleteTask(TaskVo task) {
        return 0;
    }
}
