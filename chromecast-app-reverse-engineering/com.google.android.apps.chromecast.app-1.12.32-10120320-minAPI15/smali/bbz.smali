.class final Lbbz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lbbx;


# direct methods
.method constructor <init>(Lbbx;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lbbz;->a:Lbbx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 152
    iget-object v0, p0, Lbbz;->a:Lbbx;

    invoke-static {v0}, Lbbx;->c(Lbbx;)Lblp;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    .line 153
    iget-object v0, p0, Lbbz;->a:Lbbx;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 153
    sget v1, Lb;->ac:I

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 155
    iget-object v0, p0, Lbbz;->a:Lbbx;

    invoke-static {v0}, Lbbx;->b(Lbbx;)Lr;

    move-result-object v0

    invoke-virtual {v0}, Lr;->d()Z

    .line 156
    return-void
.end method
