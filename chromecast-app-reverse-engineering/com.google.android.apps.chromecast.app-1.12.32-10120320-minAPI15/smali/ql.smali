.class public final Lql;
.super Lqg;
.source "PG"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcd;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Lqg;-><init>(Landroid/content/Context;Lcd;)V

    .line 36
    return-void
.end method


# virtual methods
.method final a(Landroid/view/ActionProvider;)Lqh;
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lqm;

    iget-object v1, p0, Lql;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1}, Lqm;-><init>(Lql;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-object v0
.end method
