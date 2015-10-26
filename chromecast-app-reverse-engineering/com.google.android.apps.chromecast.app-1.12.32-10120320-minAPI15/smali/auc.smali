.class final Lauc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:J

.field private synthetic b:Lauo;

.field private synthetic c:Latz;


# direct methods
.method constructor <init>(Latz;JLauo;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lauc;->c:Latz;

    iput-wide p2, p0, Lauc;->a:J

    iput-object p4, p0, Lauc;->b:Lauo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 99
    .line 1103
    iget-object v0, p0, Lauc;->c:Latz;

    iget-wide v2, p0, Lauc;->a:J

    invoke-virtual {v0, v2, v3}, Latz;->a(J)V

    .line 1104
    iget-object v0, p0, Lauc;->b:Lauo;

    if-eqz v0, :cond_0

    .line 1105
    iget-object v0, p0, Lauc;->b:Lauo;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lauo;->a(Z)V

    .line 99
    :cond_0
    return-void
.end method
