.class final Lok;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Loj;


# direct methods
.method constructor <init>(Loj;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lok;->a:Loj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 237
    iget-object v0, p0, Lok;->a:Loj;

    iget-object v0, v0, Loj;->a:Loi;

    invoke-static {v0}, Loi;->a(Loi;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lok;->a:Loj;

    iget-object v0, v0, Loj;->a:Loi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Loi;->a(Loi;Z)Z

    .line 239
    iget-object v0, p0, Lok;->a:Loj;

    iget-object v0, v0, Loj;->a:Loi;

    invoke-static {v0}, Loi;->b(Loi;)V

    .line 241
    :cond_0
    return-void
.end method
