package com.theokanning.openai;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The OpenAI resources used by a request
 */
@Data
public class Usage {
    /**
     * The number of prompt tokens used.
     */
    @JsonProperty("prompt_tokens")
    long promptTokens;

    /**
     * The number of completion tokens used.
     */
    @JsonProperty("completion_tokens")
    long completionTokens;

    /**
     * The number of total tokens used
     */
    @JsonProperty("total_tokens")
    long totalTokens;

    @JsonProperty("completion_tokens_details")
    Details completionTokensDetails;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Details {
        @JsonProperty("reasoning_tokens")
        long reasoningTokens;
    }
}
