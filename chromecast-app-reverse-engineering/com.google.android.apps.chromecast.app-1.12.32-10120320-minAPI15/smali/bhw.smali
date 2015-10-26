.class final Lbhw;
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
    .line 931
    iput-object p1, p0, Lbhw;->b:Lbhf;

    iput-object p2, p0, Lbhw;->a:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 934
    iget-object v0, p0, Lbhw;->b:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    sget v1, Lb;->do:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 935
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 936
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 941
    iget-object v0, p0, Lbhw;->b:Lbhf;

    invoke-static {v0}, Lbhf;->i(Lbhf;)Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lbhw;->a:Lbdf;

    .line 1692
    iget-boolean v1, v1, Lbdf;->O:Z

    .line 941
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 942
    return-void
.end method
