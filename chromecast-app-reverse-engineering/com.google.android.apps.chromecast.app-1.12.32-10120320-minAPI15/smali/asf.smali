.class final Lasf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lauo;


# instance fields
.field private synthetic a:Lasb;


# direct methods
.method constructor <init>(Lasb;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lasf;->a:Lasb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 2

    .prologue
    .line 190
    if-eqz p1, :cond_0

    iget-object v0, p1, Laef;->a:Ladp;

    if-eqz v0, :cond_0

    iget-object v0, p1, Laef;->a:Ladp;

    iget v0, v0, Ladp;->a:I

    const/16 v1, 0x196

    if-ne v0, v1, :cond_0

    .line 192
    iget-object v0, p0, Lasf;->a:Lasb;

    .line 3020
    iget-object v0, v0, Lasb;->c:Lasg;

    .line 192
    invoke-interface {v0}, Lasg;->f_()V

    .line 196
    :cond_0
    iget-object v0, p0, Lasf;->a:Lasb;

    invoke-static {v0}, Lasb;->a(Lasb;)V

    .line 197
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lasf;->a:Lasb;

    invoke-static {v0}, Lasb;->a(Lasb;)V

    .line 183
    iget-object v0, p0, Lasf;->a:Lasb;

    .line 1020
    iget-object v0, v0, Lasb;->c:Lasg;

    .line 183
    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 184
    iget-object v0, p0, Lasf;->a:Lasb;

    .line 2020
    iget-object v0, v0, Lasb;->c:Lasg;

    .line 184
    invoke-interface {v0}, Lasg;->d_()V

    .line 186
    :cond_0
    return-void
.end method
