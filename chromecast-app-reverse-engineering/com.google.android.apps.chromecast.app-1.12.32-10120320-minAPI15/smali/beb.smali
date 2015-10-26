.class final Lbeb;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:Lbdr;


# direct methods
.method constructor <init>(Lbea;Lbdn;Lbdr;)V
    .locals 1

    .prologue
    .line 409
    iput-object p3, p0, Lbeb;->a:Lbdr;

    iget-object v0, p1, Lbea;->a:Lbdu;

    invoke-direct {p0, v0, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Lbeb;->a:Lbdr;

    .line 1065
    iget-object v0, v0, Lbdr;->a:Ljava/util/ArrayList;

    .line 413
    invoke-virtual {p0, v0}, Lbeb;->a(Ljava/lang/Object;)V

    .line 414
    return-void
.end method
