.class final Lcws;
.super Lcxz;


# static fields
.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->F:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcws;->b:Ljava/lang/String;

    sget-object v0, Lcit;->s:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcws;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcws;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcxz;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 2

    const/16 v1, 0x40

    sget-object v0, Lcws;->c:Ljava/lang/String;

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->d(Lcje;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x42

    :goto_0
    :try_start_0
    invoke-static {p2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_1
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    move v0, v1

    goto :goto_0
.end method
