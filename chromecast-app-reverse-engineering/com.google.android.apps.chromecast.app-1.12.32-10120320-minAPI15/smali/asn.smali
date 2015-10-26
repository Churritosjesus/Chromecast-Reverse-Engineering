.class final Lasn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lauo;


# instance fields
.field private synthetic a:Lash;


# direct methods
.method constructor <init>(Lash;)V
    .locals 0

    .prologue
    .line 612
    iput-object p1, p0, Lasn;->a:Lash;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 2

    .prologue
    .line 622
    if-eqz p1, :cond_0

    iget-object v0, p1, Laef;->a:Ladp;

    if-eqz v0, :cond_0

    iget-object v0, p1, Laef;->a:Ladp;

    iget v0, v0, Ladp;->a:I

    const/16 v1, 0x196

    if-ne v0, v1, :cond_0

    .line 624
    iget-object v0, p0, Lasn;->a:Lash;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lash;->a(Lash;Z)Z

    .line 626
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 615
    if-eqz p1, :cond_0

    .line 616
    iget-object v0, p0, Lasn;->a:Lash;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lash;->b(I)V

    .line 618
    :cond_0
    return-void
.end method
