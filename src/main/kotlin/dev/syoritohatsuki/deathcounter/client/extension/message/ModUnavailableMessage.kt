package dev.syoritohatsuki.deathcounter.client.extension.message

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.ClickEvent
import net.minecraft.text.HoverEvent
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting

fun PlayerEntity.modUnavailableOnServerMessage() {
    sendMessage(
        TranslatableText("message.warning")
            .styled { style ->
                style.withColor(Formatting.RED)
                    .withBold(true)
                    .withHoverEvent(
                        HoverEvent(
                            HoverEvent.Action.SHOW_TEXT,
                            TranslatableText("message.warning.tooltip")
                                .styled { subStyle ->
                                    subStyle.withColor(Formatting.RED)
                                        .withBold(true)
                                }
                        )
                    ).withClickEvent(
                        ClickEvent(
                            ClickEvent.Action.RUN_COMMAND,
                            "/dcc warning false"
                        )
                    )
            }, false
    )
}