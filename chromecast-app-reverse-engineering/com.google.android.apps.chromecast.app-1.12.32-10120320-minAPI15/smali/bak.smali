.class final Lbak;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lcqh;


# instance fields
.field private synthetic a:Lmm;


# direct methods
.method constructor <init>(Lbah;Lmm;)V
    .locals 0

    .prologue
    .line 193
    iput-object p2, p0, Lbak;->a:Lmm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 196
    iget-object v0, p0, Lbak;->a:Lmm;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.SYNC_SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lmm;->startActivity(Landroid/content/Intent;)V

    .line 197
    return-void
.end method
