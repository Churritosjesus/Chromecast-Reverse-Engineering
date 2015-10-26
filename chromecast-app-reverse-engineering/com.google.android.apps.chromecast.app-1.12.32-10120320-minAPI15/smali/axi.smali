.class final Laxi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Laxh;


# direct methods
.method constructor <init>(Laxh;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Laxi;->a:Laxh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 206
    check-cast p1, Ldat;

    .line 1209
    iget-object v0, p0, Laxi;->a:Laxh;

    iget-object v0, v0, Laxh;->a:Laxd;

    .line 2029
    iput-object p1, v0, Laxd;->c:Ldat;

    .line 1210
    iget-object v0, p0, Laxi;->a:Laxh;

    iget-object v0, v0, Laxh;->a:Laxd;

    .line 3029
    iget-object v0, v0, Laxd;->g:Laxn;

    .line 1210
    if-eqz v0, :cond_0

    .line 1211
    iget-object v0, p0, Laxi;->a:Laxh;

    iget-object v0, v0, Laxh;->a:Laxd;

    iget-object v1, p0, Laxi;->a:Laxh;

    iget-object v1, v1, Laxh;->a:Laxd;

    .line 4029
    iget-object v1, v1, Laxd;->c:Ldat;

    .line 1211
    iget-object v1, v1, Ldat;->a:[Ldau;

    array-length v1, v1

    new-array v1, v1, [I

    .line 5029
    iput-object v1, v0, Laxd;->e:[I

    .line 1212
    iget-object v0, p0, Laxi;->a:Laxh;

    iget-object v0, v0, Laxh;->a:Laxd;

    .line 6029
    iget-object v0, v0, Laxd;->g:Laxn;

    .line 1212
    iget-object v1, p0, Laxi;->a:Laxh;

    iget-object v1, v1, Laxh;->a:Laxd;

    .line 7029
    iget-object v1, v1, Laxd;->c:Ldat;

    .line 1212
    iget-object v1, v1, Ldat;->a:[Ldau;

    iget-object v2, p0, Laxi;->a:Laxh;

    iget-object v2, v2, Laxh;->a:Laxd;

    .line 8029
    iget-object v2, v2, Laxd;->e:[I

    .line 1212
    invoke-interface {v0, v1, v2}, Laxn;->a([Ldau;[I)V

    .line 1215
    :cond_0
    iget-object v0, p0, Laxi;->a:Laxh;

    iget-object v0, v0, Laxh;->a:Laxd;

    const/4 v1, 0x0

    .line 9029
    iput-object v1, v0, Laxd;->j:Laef;

    .line 1216
    iget-object v0, p0, Laxi;->a:Laxh;

    iget-object v0, v0, Laxh;->a:Laxd;

    invoke-static {v0}, Laxd;->a(Laxd;)V

    .line 206
    return-void
.end method
