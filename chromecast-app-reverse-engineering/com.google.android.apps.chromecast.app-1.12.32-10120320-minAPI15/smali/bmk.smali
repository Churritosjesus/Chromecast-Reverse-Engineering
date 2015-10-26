.class final Lbmk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbmj;


# direct methods
.method constructor <init>(Lbmj;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lbmk;->a:Lbmj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 108
    iget-object v0, p0, Lbmk;->a:Lbmj;

    iget-object v0, v0, Lbmj;->a:Lbmi;

    invoke-static {v0}, Lbmi;->c(Lbmi;)Lbos;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbmk;->a:Lbmj;

    iget-object v0, v0, Lbmj;->a:Lbmi;

    invoke-static {v0}, Lbmi;->d(Lbmi;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbmk;->a:Lbmj;

    iget-object v0, v0, Lbmj;->a:Lbmi;

    invoke-static {v0}, Lbmi;->d(Lbmi;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    iget-object v1, p0, Lbmk;->a:Lbmj;

    iget-object v1, v1, Lbmj;->a:Lbmi;

    .line 109
    invoke-static {v1}, Lbmi;->b(Lbmi;)Landroid/app/AlertDialog;

    move-result-object v1

    iget-object v2, p0, Lbmk;->a:Lbmj;

    iget-object v2, v2, Lbmj;->a:Lbmi;

    invoke-static {v2}, Lbmi;->c(Lbmi;)Lbos;

    move-result-object v2

    invoke-virtual {v2}, Lbos;->a()Lbfs;

    move-result-object v2

    .line 108
    invoke-virtual {v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Landroid/app/AlertDialog;Lbfs;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    :cond_0
    iget-object v0, p0, Lbmk;->a:Lbmj;

    iget-object v0, v0, Lbmj;->a:Lbmi;

    invoke-static {v0}, Lbmi;->b(Lbmi;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 113
    :cond_1
    return-void
.end method
