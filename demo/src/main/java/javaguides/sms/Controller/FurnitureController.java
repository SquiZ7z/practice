package javaguides.sms.Controller;

import javaguides.sms.Service.FurnitureService;
import javaguides.sms.entity.Furniture;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FurnitureController {

    private FurnitureService furnitureService;

    public FurnitureController(FurnitureService furnitureService) {
        super();
        this.furnitureService = furnitureService;
    }


    //метод обробки для обробки списку меблів і режиму повернення та перегляду
    @GetMapping("/furniture")
    public  String listFurniture(Model model){
        model.addAttribute("furniture", furnitureService.getAllFurniture());
        return "furniture";
    }
    @GetMapping("/furniture/new")
    public String createFurnitureForm(Model model){


       Furniture furniture = new Furniture();
       model.addAttribute("furniture", furniture);
       return "create_furniture";
    }
    @PostMapping("/furniture")
    public String saveFurniture(@ModelAttribute ("furniture") Furniture furniture){
        furnitureService.saveFurniture(furniture);
        return "redirect:/furniture";

    }
    @GetMapping("/furniture/edit/{id}")
    public String editFurniture(@PathVariable Long id, Model model){
            model.addAttribute("furniture", furnitureService.getFurnitureById(id));
            return "edit_furniture";
    }
    @PostMapping("/furniture/{id}")
    public String updateFurniture(@PathVariable Long id,
                                  @ModelAttribute ("furniture") Furniture furniture, Model model){


        //отримати меблі з бази даних за ідентифікатором

        Furniture existingFurniture = furnitureService.getFurnitureById(id);
        existingFurniture.setId(id);
        existingFurniture.setName(furniture.getName());
        existingFurniture.setMaterial(furniture.getMaterial());
        existingFurniture.setPrice(furniture.getPrice());

        //зберегти оновлений предмет меблів
        furnitureService.updateFurniture(existingFurniture);
        return "redirect:/furniture";
    }


        //метод обробки для обробки запиту меблів

        @GetMapping("/furniture/{id}")
        public String deleteFurniture(@PathVariable Long id){
            furnitureService.deleteFurnitureById(id);
            return "redirect:/furniture";
        }

        

}

