package assignment_6.cput.za.ac.pc_assembly_store_app.factories;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.CPU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Processor_Brand;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface CPUFactory {
    CPU createCPU(Long id, String code, String description, Integer socket, Processor_Brand processorBrand, double speed_Ghz, double cache_MB, Integer cores, boolean active);
}
