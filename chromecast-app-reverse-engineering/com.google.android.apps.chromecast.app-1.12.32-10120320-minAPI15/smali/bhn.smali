.class final Lbhn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laop;


# instance fields
.field private synthetic a:I

.field private synthetic b:Lbhf;


# direct methods
.method constructor <init>(Lbhf;I)V
    .locals 0

    .prologue
    .line 807
    iput-object p1, p0, Lbhn;->b:Lbhf;

    iput p2, p0, Lbhn;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 810
    iget-object v0, p0, Lbhn;->b:Lbhf;

    invoke-static {v0}, Lbhf;->a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    move-result-object v0

    sget v1, Lb;->do:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 811
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 812
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 817
    iget-object v0, p0, Lbhn;->b:Lbhf;

    invoke-static {v0}, Lbhf;->f(Lbhf;)Landroid/widget/Spinner;

    move-result-object v0

    iget v1, p0, Lbhn;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 818
    return-void
.end method
