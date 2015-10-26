.class final Lase;
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
    .line 153
    iput-object p1, p0, Lase;->a:Lasb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lase;->a:Lasb;

    invoke-static {v0}, Lasb;->a(Lasb;)V

    .line 168
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lase;->a:Lasb;

    .line 1020
    iget-object v0, v0, Lasb;->c:Lasg;

    .line 158
    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lase;->a:Lasb;

    .line 2020
    iget-object v0, v0, Lasb;->c:Lasg;

    .line 159
    invoke-interface {v0}, Lasg;->e_()V

    .line 161
    :cond_0
    iget-object v0, p0, Lase;->a:Lasb;

    invoke-static {v0}, Lasb;->a(Lasb;)V

    .line 162
    return-void
.end method
