.class final Lbxa;
.super Ljava/lang/Object;

# interfaces
.implements Lbxg;


# instance fields
.field private synthetic a:Lbwz;


# direct methods
.method constructor <init>(Lbwz;)V
    .locals 0

    iput-object p1, p0, Lbxa;->a:Lbwz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lbxi;)V
    .locals 1

    iget-object v0, p0, Lbxa;->a:Lbwz;

    iget-object v0, v0, Lbwz;->q:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
