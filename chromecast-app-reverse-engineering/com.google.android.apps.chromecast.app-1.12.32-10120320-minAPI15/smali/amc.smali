.class final Lamc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lasp;


# instance fields
.field private synthetic a:Lamb;


# direct methods
.method constructor <init>(Lamb;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lamc;->a:Lamb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i()V
    .locals 0

    .prologue
    .line 214
    return-void
.end method

.method public final j()V
    .locals 0

    .prologue
    .line 218
    return-void
.end method

.method public final k()V
    .locals 3

    .prologue
    .line 222
    iget-object v0, p0, Lamc;->a:Lamb;

    iget-object v0, v0, Lamb;->a:Lama;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 222
    sget v1, Lb;->T:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 224
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 225
    return-void
.end method

.method public final l()V
    .locals 3

    .prologue
    .line 229
    iget-object v0, p0, Lamc;->a:Lamb;

    iget-object v0, v0, Lamb;->a:Lama;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 229
    sget v1, Lb;->al:I

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 231
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 232
    return-void
.end method
