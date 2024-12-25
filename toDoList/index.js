document.addEventListener('DOMContentLoaded', () => {

    document.getElementById("head").style.color = "blue";
    document.querySelector("header").classList.add("sticky");

    const taskInput = document.getElementById('taskInput');
    const addBtnTask = document.getElementById('addBtnTask');
    const listofTask = document.getElementById('listofTask');
    const reComTask = document.getElementById('reComTask');

    addBtnTask.addEventListener('click', () => {
        const taskText = taskInput.value.trim();

        if (taskText === '') {
            alert('Please enter a task!');
            return;
        }

        const taskItem = document.createElement('li');
        const checkBox = document.createElement('input');
        checkBox.type = 'checkbox';

        taskItem.textContent = taskText;
        taskItem.prepend(checkBox);

        listofTask.appendChild(taskItem);

        taskInput.value = '';
    });

    listofTask.addEventListener('change', (event) => {
        if (event.target.tagName === 'INPUT' && event.target.type === 'checkbox') {
            const taskItem = event.target.parentElement;
            taskItem.classList.toggle('completed');
        }
    });

    reComTask.addEventListener('click', () => {
        const completedTask = document.querySelectorAll('.completed');
        completedTask.forEach(task => task.remove());
    });
});
