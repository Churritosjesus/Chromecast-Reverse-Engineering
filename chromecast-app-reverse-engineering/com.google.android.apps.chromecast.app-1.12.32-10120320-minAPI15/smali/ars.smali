.class final Lars;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Larp;


# direct methods
.method constructor <init>(Larp;)V
    .locals 0

    .prologue
    .line 516
    iput-object p1, p0, Lars;->a:Larp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 519
    iget-object v0, p0, Lars;->a:Larp;

    invoke-static {v0}, Larp;->a(Larp;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 520
    iget-object v0, p0, Lars;->a:Larp;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 520
    sget v1, Lb;->ac:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 521
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 522
    return-void
.end method
