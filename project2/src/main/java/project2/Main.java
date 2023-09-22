package project2;

import com.azure.ai.textanalytics.TextAnalyticsClient;
import com.azure.ai.textanalytics.TextAnalyticsClientBuilder;
import com.azure.ai.textanalytics.models.*;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.Context;

public class Main {
    public static void main(String[] args) {
        // Configurar a chave e o ponto de extremidade
        String chave = "d8a618edd5ae46aeb972771edc9823a3";
        String pontoExtremidade = "https://ti2ia.cognitiveservices.azure.com/";

        // Inicializar o cliente de Análise de Texto
        TextAnalyticsClient client = new TextAnalyticsClientBuilder()
                .credential(new AzureKeyCredential(chave))
                .endpoint(pontoExtremidade)
                .buildClient();

        // Texto para análise de sentimento
        String texto = "Eu estou muito feliz com este serviço.";

        // Analisar o sentimento do texto
        DocumentSentiment resultado = client.analyzeSentiment(texto);

        // Exibir o resultado
        System.out.println("Sentimento: " + resultado.getSentiment());
    }
}
