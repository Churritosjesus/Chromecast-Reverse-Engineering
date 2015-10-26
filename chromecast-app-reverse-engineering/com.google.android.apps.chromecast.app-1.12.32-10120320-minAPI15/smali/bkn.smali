.class public final Lbkn;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:J

.field final b:Ljava/lang/Object;

.field final synthetic c:Lbkm;


# direct methods
.method public constructor <init>(Lbkm;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 37
    iput-object p1, p0, Lbkn;->c:Lbkm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p2, p0, Lbkn;->b:Ljava/lang/Object;

    .line 39
    invoke-static {p1}, Lbkm;->a(Lbkm;)Lbkl;

    invoke-static {}, Lbkl;->b()J

    move-result-wide v0

    sget-wide v2, Lbkm;->b:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lbkn;->a:J

    .line 40
    return-void
.end method
