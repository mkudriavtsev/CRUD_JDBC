package view.commands.skillCommands;

import controller.SkillController;

import dto.SkillDto;
import view.commands.Command;
import view.console.ConsoleUtils;

public class DeleteSkillCommand implements Command {
    private SkillController skillController = SkillController.getSkillController();
    private ConsoleUtils consoleUtils = ConsoleUtils.getConsoleUtils();
    public void execute() {
        System.out.println("Enter a skill name:");
        String skillName = consoleUtils.getStringFromConsole();
        if (skillName.equalsIgnoreCase("cancel")) {
            System.out.println("Operation canceled");
            return;
        }
        SkillDto skillDto = skillController.deleteSkill(skillName);
        if(skillDto.getErrorMessage() != null){
            System.out.println(skillDto.getErrorMessage());
        }


    }
}
