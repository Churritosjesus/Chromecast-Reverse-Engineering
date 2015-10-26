.class final Lbmz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lbmu;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 1016
    iput-object p2, p0, Lbmz;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1019
    iget-object v0, p0, Lbmz;->a:Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1020
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    iget-object v1, p0, Lbmz;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->startActivity(Landroid/content/Intent;)V

    .line 1021
    return-void
.end method
