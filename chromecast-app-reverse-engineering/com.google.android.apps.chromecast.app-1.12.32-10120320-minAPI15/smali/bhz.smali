.class final Lbhz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 1033
    iput-object p1, p0, Lbhz;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 1033
    check-cast p1, Ljava/lang/String;

    .line 2037
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2040
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->l(Lbhf;)Lbdf;

    move-result-object v0

    .line 2712
    iput-object p1, v0, Lbdf;->R:Ljava/lang/String;

    .line 2042
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0, p1}, Lbhf;->a(Lbhf;Ljava/lang/String;)V

    .line 2043
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->m(Lbhf;)Landroid/widget/CompoundButton;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->m(Lbhf;)Landroid/widget/CompoundButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2044
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0, p1}, Lbhf;->b(Lbhf;Ljava/lang/String;)V

    .line 1033
    :cond_0
    return-void
.end method

.method public final b_(I)V
    .locals 2

    .prologue
    .line 1050
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1057
    :cond_0
    :goto_0
    return-void

    .line 1054
    :cond_1
    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->m(Lbhf;)Landroid/widget/CompoundButton;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbhz;->a:Lbhf;

    invoke-static {v0}, Lbhf;->m(Lbhf;)Landroid/widget/CompoundButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1055
    iget-object v0, p0, Lbhz;->a:Lbhf;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbhf;->b(Lbhf;Ljava/lang/String;)V

    goto :goto_0
.end method
