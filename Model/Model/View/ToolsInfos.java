package View;

import java.util.*;

/**
 * 
 */
public class ToolsInfos extends SideInfos {

    /**
     * Default constructor
     */
    public ToolsInfos() {
    }

    /**
     * 
     */
    private Set<String> requirement;

    /**
     * 
     */
    private String image;

    /**
     * @param name 
     * @param desc 
     * @param Requirement 
     * @param img
     */
    public void ToolsInfos(String name, String desc, ArrayList<String> Requirement, String img) {
        // TODO implement here
    }

    /**
     * 
     */
    public class PersonnalInfos extends SideInfos {

        /**
         * Default constructor
         */
        public PersonnalInfos() {
        }

        /**
         * 
         */
        private ArrayList<String> jobs;

        /**
         * 
         */
        private String images;

        /**
         * @param name 
         * @param desc 
         * @param jobs 
         * @param img
         */
        public void Personnalnofs(String name, String desc, ArrayList<String> jobs, String img) {
            // TODO implement here
        }

    }

    /**
     * 
     */
    public abstract class SideInfos {

        /**
         * Default constructor
         */
        public SideInfos() {
        }

        /**
         * 
         */
        private String name;

        /**
         * 
         */
        private String desc;

        /**
         * @param name 
         * @param des
         */
        public void sideInfos(String name, String des) {
            // TODO implement here
        }

    }

    /**
     * 
     */
    public class RelicInfo extends SideInfos {

        /**
         * Default constructor
         */
        public RelicInfo() {
        }

        /**
         * @param name 
         * @param desc 
         * @param img
         */
        public void ReliqueInfos(String name, String desc, String img) {
            // TODO implement here
        }

    }

}