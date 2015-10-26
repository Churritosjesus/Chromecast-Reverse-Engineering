.class final Lbia;
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
    .line 1069
    iput-object p1, p0, Lbia;->b:Lbhf;

    iput-object p2, p0, Lbia;->a:Lbdf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 1073
    iget-object v0, p0, Lbia;->b:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    sget v1, Lb;->do:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1074
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 1079
    iget-object v0, p0, Lbia;->b:Lbhf;

    iget-object v1, p0, Lbia;->a:Lbdf;

    invoke-virtual {v1}, Lbdf;->c()Z

    move-result v1

    invoke-static {v0, v1}, Lbhf;->e(Lbhf;Z)V

    .line 1080
    return-void
.end method
