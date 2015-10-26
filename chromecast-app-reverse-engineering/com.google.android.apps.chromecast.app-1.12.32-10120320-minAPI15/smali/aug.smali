.class final Laug;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Ladz;


# direct methods
.method constructor <init>(Ladz;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Laug;->a:Ladz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    invoke-static {v0}, Lauf;->a(I)V

    .line 55
    iget-object v0, p0, Laug;->a:Ladz;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Laug;->a:Ladz;

    invoke-interface {v0, p1}, Ladz;->a(Laef;)V

    .line 58
    :cond_0
    return-void
.end method
