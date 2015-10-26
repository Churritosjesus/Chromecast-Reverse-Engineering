.class final Lanw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbdj;

.field private synthetic b:Lanv;


# direct methods
.method constructor <init>(Lanv;Lbdj;)V
    .locals 0

    .prologue
    .line 1413
    iput-object p1, p0, Lanw;->b:Lanv;

    iput-object p2, p0, Lanw;->a:Lbdj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1413
    check-cast p1, Lbdf;

    .line 2417
    iget-object v0, p0, Lanw;->b:Lanv;

    iget-object v0, v0, Lanv;->a:Land;

    iget-object v1, p0, Lanw;->a:Lbdj;

    invoke-static {v0, v1, p1}, Land;->a(Land;Lbdj;Lbdf;)V

    .line 1413
    return-void
.end method

.method public final b_(I)V
    .locals 3

    .prologue
    .line 1423
    iget-object v0, p0, Lanw;->b:Lanv;

    iget-object v0, v0, Lanv;->a:Land;

    iget-object v1, p0, Lanw;->a:Lbdj;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Land;->a(Land;Lbdj;Lbdf;)V

    .line 1424
    return-void
.end method
