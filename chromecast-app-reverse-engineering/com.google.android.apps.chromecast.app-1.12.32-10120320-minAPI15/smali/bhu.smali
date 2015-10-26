.class final Lbhu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:Lbdf;

.field private synthetic b:Lbhf;


# direct methods
.method constructor <init>(Lbhf;Lbdf;)V
    .locals 0

    .prologue
    .line 887
    iput-object p1, p0, Lbhu;->b:Lbhf;

    iput-object p2, p0, Lbhu;->a:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 890
    iget-object v0, p0, Lbhu;->b:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    sget v1, Lb;->do:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 891
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 892
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 897
    iget-object v0, p0, Lbhu;->b:Lbhf;

    invoke-static {v0}, Lbhf;->g(Lbhf;)Landroid/support/v7/widget/SwitchCompat;

    move-result-object v0

    iget-object v1, p0, Lbhu;->a:Lbdf;

    .line 1676
    iget-boolean v1, v1, Lbdf;->M:Z

    .line 897
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 898
    return-void
.end method
