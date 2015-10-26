.class public final Lamz;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/MainActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V
    .locals 0

    .prologue
    .line 593
    iput-object p1, p0, Lamz;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 596
    const-string v0, "connected"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 598
    if-nez v0, :cond_0

    .line 599
    iget-object v0, p0, Lamz;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    iget-object v1, p0, Lamz;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    sget v2, Lb;->ee:I

    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 1515
    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_0

    .line 1516
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1517
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lb;->I:I

    const/4 v3, 0x0

    .line 1518
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1519
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/apps/chromecast/app/MainActivity;->e:Landroid/app/AlertDialog;

    .line 1520
    iget-object v1, v0, Lcom/google/android/apps/chromecast/app/MainActivity;->e:Landroid/app/AlertDialog;

    new-instance v2, Lamy;

    invoke-direct {v2, v0}, Lamy;-><init>(Lcom/google/android/apps/chromecast/app/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1526
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/MainActivity;->e:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 601
    :cond_0
    iget-object v0, p0, Lamz;->a:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-virtual {v0, p0}, Lcom/google/android/apps/chromecast/app/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 602
    return-void
.end method
