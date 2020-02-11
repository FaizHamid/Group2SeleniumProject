package keywords;

import common.CommonAPI;
import utility.DataReader;
import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {
        DataReader dr = new DataReader();

        public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
            String path = System.getProperty("user.dir") + "/data/keywords.xls";
            String[] data = dr.fileReader2(path, 0);
            return data;
        }
}

