.class final Lann;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lapd;

.field final synthetic b:J

.field final synthetic c:Land;


# direct methods
.method constructor <init>(Land;Lapd;J)V
    .locals 1

    .prologue
    .line 1011
    iput-object p1, p0, Lann;->c:Land;

    iput-object p2, p0, Lann;->a:Lapd;

    iput-wide p3, p0, Lann;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1016
    iget-object v0, p0, Lann;->c:Land;

    invoke-static {v0}, Land;->m(Land;)Lbdm;

    move-result-object v0

    new-instance v1, Lano;

    invoke-direct {v1, p0}, Lano;-><init>(Lann;)V

    invoke-virtual {v0, v1}, Lbdm;->a(Lbdn;)V

    .line 1067
    return-void
.end method
