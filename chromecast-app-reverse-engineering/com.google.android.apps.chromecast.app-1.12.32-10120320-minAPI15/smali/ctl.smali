.class final Lctl;
.super Ljava/lang/Object;

# interfaces
.implements Lczd;


# instance fields
.field private synthetic a:Lctk;


# direct methods
.method constructor <init>(Lctk;)V
    .locals 0

    iput-object p1, p0, Lctl;->a:Lctk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lctl;->a:Lctk;

    invoke-virtual {v0, p1}, Lctk;->b(Ljava/lang/String;)Ls;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-interface {v0}, Ls;->j()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method
