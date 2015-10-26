.class final Lbih;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 522
    iput-object p1, p0, Lbih;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 526
    iget-object v0, p0, Lbih;->a:Lbhf;

    iget-object v1, p0, Lbih;->a:Lbhf;

    .line 527
    invoke-static {v1}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->D()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbmg;->a(Ljava/lang/String;)Lbmg;

    move-result-object v1

    .line 526
    invoke-static {v0, v1}, Lbhf;->a(Lbhf;Lbmg;)Lbmg;

    .line 528
    iget-object v0, p0, Lbih;->a:Lbhf;

    invoke-static {v0}, Lbhf;->b(Lbhf;)Lbmg;

    move-result-object v0

    iget-object v1, p0, Lbih;->a:Lbhf;

    .line 529
    invoke-static {v1}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v1

    .line 1808
    iget-object v1, v1, Lm;->b:Lt;

    .line 529
    const-string v2, "deviceNameEditFragment"

    .line 528
    invoke-virtual {v0, v1, v2}, Lbmg;->a(Lr;Ljava/lang/String;)V

    .line 530
    return-void
.end method
