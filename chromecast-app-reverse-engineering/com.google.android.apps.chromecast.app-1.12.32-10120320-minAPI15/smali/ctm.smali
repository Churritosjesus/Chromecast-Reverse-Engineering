.class final Lctm;
.super Ljava/lang/Object;

# interfaces
.implements Lczd;


# instance fields
.field private synthetic a:Lctk;


# direct methods
.method constructor <init>(Lctk;)V
    .locals 0

    iput-object p1, p0, Lctm;->a:Lctk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lctm;->a:Lctk;

    invoke-virtual {v0, p1}, Lctk;->c(Ljava/lang/String;)Ls;

    invoke-static {}, Lcyh;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
