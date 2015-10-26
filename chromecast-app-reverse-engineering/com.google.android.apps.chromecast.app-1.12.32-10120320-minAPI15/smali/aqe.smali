.class final Laqe;
.super Lua;
.source "PG"


# instance fields
.field private synthetic a:Z

.field private synthetic b:Laqd;


# direct methods
.method constructor <init>(Laqd;Z)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Laqe;->b:Laqd;

    iput-boolean p2, p0, Laqe;->a:Z

    invoke-direct {p0}, Lua;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 118
    return-void
.end method

.method public final a(Ltz;Luh;)V
    .locals 3

    .prologue
    .line 101
    iget-object v0, p0, Laqe;->b:Laqd;

    iget-object v1, p0, Laqe;->b:Laqd;

    .line 1025
    iget-object v1, v1, Laqd;->d:Ljava/lang/String;

    .line 101
    iget-boolean v2, p0, Laqe;->a:Z

    .line 2025
    invoke-virtual {v0, p2, v1, v2}, Laqd;->a(Luh;Ljava/lang/String;Z)Z

    move-result v0

    .line 101
    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Laqe;->b:Laqd;

    .line 3025
    invoke-virtual {v0}, Laqd;->a()V

    .line 106
    :cond_0
    return-void
.end method

.method public final a(Luh;)V
    .locals 0

    .prologue
    .line 114
    return-void
.end method

.method public final b(Ltz;Luh;)V
    .locals 0

    .prologue
    .line 110
    return-void
.end method
