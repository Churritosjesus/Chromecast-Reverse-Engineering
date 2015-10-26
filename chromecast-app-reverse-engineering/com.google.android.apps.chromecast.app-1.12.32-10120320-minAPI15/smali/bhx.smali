.class final Lbhx;
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
    .line 956
    iput-object p1, p0, Lbhx;->b:Lbhf;

    iput-object p2, p0, Lbhx;->a:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 959
    iget-object v0, p0, Lbhx;->b:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    sget v1, Lb;->do:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 960
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 965
    iget-object v0, p0, Lbhx;->b:Lbhf;

    invoke-static {v0}, Lbhf;->j(Lbhf;)Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lbhx;->a:Lbdf;

    .line 1708
    iget-boolean v1, v1, Lbdf;->Q:Z

    .line 965
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 966
    return-void
.end method
