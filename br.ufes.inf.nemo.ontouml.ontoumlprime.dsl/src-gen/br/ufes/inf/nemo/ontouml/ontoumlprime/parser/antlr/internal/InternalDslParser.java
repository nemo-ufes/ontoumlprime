package br.ufes.inf.nemo.ontouml.ontoumlprime.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.inf.nemo.ontouml.ontoumlprime.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'complete'", "'GeneralizationSet'", "'specializes'", "'into'", "','", "';'", "'PrimitiveDataType'", "'('", "')'", "'ComplexDataType'", "'enum'", "'essential'", "'inseparable'", "'shareable'", "'immutable'", "'relation'", "'['", "'..'", "']'", "'isComponentOf'", "'isMemberOf'", "'isSubCollectionOf'", "'isSubQuantityOf'", "'Kind'", "'Quantity'", "'extensional'", "'CollectiveUniversal'", "'SubKind'", "'Role'", "'Phase'", "'Category'", "'Mixin'", "'RoleMixin'", "'RelatorUniversal'", "'material'", "'rel'", "'target'", "'formal'", "'ModeUniversal'", "'QualityUniversal'", "'characterizes'", "'datatypes'", "'assoc'", "'PrimitiveDataTypeType'", "'-'", "'characterizedBy'", "'mediates'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;
     	
        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:76:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:79:28: ( ( () ( (lv_elements_1_0= ruleElement ) )* ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:1: ( () ( (lv_elements_1_0= ruleElement ) )* )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:1: ( () ( (lv_elements_1_0= ruleElement ) )* )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:2: () ( (lv_elements_1_0= ruleElement ) )*
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:80:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:86:2: ( (lv_elements_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)||LA1_0==20||(LA1_0>=23 && LA1_0<=28)||(LA1_0>=37 && LA1_0<=48)||(LA1_0>=51 && LA1_0<=53)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:87:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:87:1: (lv_elements_1_0= ruleElement )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:88:3: lv_elements_1_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleModel140);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:112:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:113:2: (iv_ruleElement= ruleElement EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:114:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement177);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:121:1: ruleElement returns [EObject current=null] : (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_GeneralizationSet_1 = null;

        EObject this_PrimitiveDataType_2 = null;

        EObject this_ComplexDataType_3 = null;

        EObject this_Enumeration_4 = null;

        EObject this_MeronymicRelation_5 = null;

        EObject this_Kind_6 = null;

        EObject this_QuantityUniversal_7 = null;

        EObject this_CollectiveUniversal_8 = null;

        EObject this_SubKind_9 = null;

        EObject this_Role_10 = null;

        EObject this_Phase_11 = null;

        EObject this_Category_12 = null;

        EObject this_Mixin_13 = null;

        EObject this_RoleMixin_14 = null;

        EObject this_RelatorUniversal_15 = null;

        EObject this_BinaryMaterialRelation_16 = null;

        EObject this_BinaryFormalRelation_17 = null;

        EObject this_ModeUniversal_18 = null;

        EObject this_QualityUniversal_19 = null;

        EObject this_nAryMaterialRelation_20 = null;

        EObject this_nAryFormalRelation_21 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:124:28: ( (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:126:5: this_Package_0= rulePackage
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePackage_in_ruleElement234);
                    this_Package_0=rulePackage();

                    state._fsp--;

                     
                            current = this_Package_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:136:5: this_GeneralizationSet_1= ruleGeneralizationSet
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getGeneralizationSetParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_ruleElement261);
                    this_GeneralizationSet_1=ruleGeneralizationSet();

                    state._fsp--;

                     
                            current = this_GeneralizationSet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:146:5: this_PrimitiveDataType_2= rulePrimitiveDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPrimitiveDataTypeParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataType_in_ruleElement288);
                    this_PrimitiveDataType_2=rulePrimitiveDataType();

                    state._fsp--;

                     
                            current = this_PrimitiveDataType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:156:5: this_ComplexDataType_3= ruleComplexDataType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getComplexDataTypeParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComplexDataType_in_ruleElement315);
                    this_ComplexDataType_3=ruleComplexDataType();

                    state._fsp--;

                     
                            current = this_ComplexDataType_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:166:5: this_Enumeration_4= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_ruleElement342);
                    this_Enumeration_4=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:176:5: this_MeronymicRelation_5= ruleMeronymicRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMeronymicRelationParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMeronymicRelation_in_ruleElement369);
                    this_MeronymicRelation_5=ruleMeronymicRelation();

                    state._fsp--;

                     
                            current = this_MeronymicRelation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:186:5: this_Kind_6= ruleKind
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getKindParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleKind_in_ruleElement396);
                    this_Kind_6=ruleKind();

                    state._fsp--;

                     
                            current = this_Kind_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:196:5: this_QuantityUniversal_7= ruleQuantityUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getQuantityUniversalParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQuantityUniversal_in_ruleElement423);
                    this_QuantityUniversal_7=ruleQuantityUniversal();

                    state._fsp--;

                     
                            current = this_QuantityUniversal_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:206:5: this_CollectiveUniversal_8= ruleCollectiveUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCollectiveUniversalParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCollectiveUniversal_in_ruleElement450);
                    this_CollectiveUniversal_8=ruleCollectiveUniversal();

                    state._fsp--;

                     
                            current = this_CollectiveUniversal_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:216:5: this_SubKind_9= ruleSubKind
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getSubKindParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_ruleElement477);
                    this_SubKind_9=ruleSubKind();

                    state._fsp--;

                     
                            current = this_SubKind_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:226:5: this_Role_10= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRoleParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRole_in_ruleElement504);
                    this_Role_10=ruleRole();

                    state._fsp--;

                     
                            current = this_Role_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:236:5: this_Phase_11= rulePhase
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulePhase_in_ruleElement531);
                    this_Phase_11=rulePhase();

                    state._fsp--;

                     
                            current = this_Phase_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:246:5: this_Category_12= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getCategoryParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleElement558);
                    this_Category_12=ruleCategory();

                    state._fsp--;

                     
                            current = this_Category_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:256:5: this_Mixin_13= ruleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMixinParserRuleCall_13()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMixin_in_ruleElement585);
                    this_Mixin_13=ruleMixin();

                    state._fsp--;

                     
                            current = this_Mixin_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:266:5: this_RoleMixin_14= ruleRoleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRoleMixinParserRuleCall_14()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_ruleElement612);
                    this_RoleMixin_14=ruleRoleMixin();

                    state._fsp--;

                     
                            current = this_RoleMixin_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:276:5: this_RelatorUniversal_15= ruleRelatorUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRelatorUniversalParserRuleCall_15()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRelatorUniversal_in_ruleElement639);
                    this_RelatorUniversal_15=ruleRelatorUniversal();

                    state._fsp--;

                     
                            current = this_RelatorUniversal_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:286:5: this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBinaryMaterialRelationParserRuleCall_16()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryMaterialRelation_in_ruleElement666);
                    this_BinaryMaterialRelation_16=ruleBinaryMaterialRelation();

                    state._fsp--;

                     
                            current = this_BinaryMaterialRelation_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:296:5: this_BinaryFormalRelation_17= ruleBinaryFormalRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBinaryFormalRelationParserRuleCall_17()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBinaryFormalRelation_in_ruleElement693);
                    this_BinaryFormalRelation_17=ruleBinaryFormalRelation();

                    state._fsp--;

                     
                            current = this_BinaryFormalRelation_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:306:5: this_ModeUniversal_18= ruleModeUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getModeUniversalParserRuleCall_18()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleModeUniversal_in_ruleElement720);
                    this_ModeUniversal_18=ruleModeUniversal();

                    state._fsp--;

                     
                            current = this_ModeUniversal_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:316:5: this_QualityUniversal_19= ruleQualityUniversal
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getQualityUniversalParserRuleCall_19()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleQualityUniversal_in_ruleElement747);
                    this_QualityUniversal_19=ruleQualityUniversal();

                    state._fsp--;

                     
                            current = this_QualityUniversal_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:326:5: this_nAryMaterialRelation_20= rulenAryMaterialRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNAryMaterialRelationParserRuleCall_20()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulenAryMaterialRelation_in_ruleElement774);
                    this_nAryMaterialRelation_20=rulenAryMaterialRelation();

                    state._fsp--;

                     
                            current = this_nAryMaterialRelation_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:336:5: this_nAryFormalRelation_21= rulenAryFormalRelation
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getNAryFormalRelationParserRuleCall_21()); 
                        
                    pushFollow(FollowSets000.FOLLOW_rulenAryFormalRelation_in_ruleElement801);
                    this_nAryFormalRelation_21=rulenAryFormalRelation();

                    state._fsp--;

                     
                            current = this_nAryFormalRelation_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRulePackage"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:360:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:361:2: (iv_rulePackage= rulePackage EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:362:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage844);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:369:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:372:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:1: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:1: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:2: () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )+ otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:373:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:374:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePackage900); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:383:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:384:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:384:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:385:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePackage917); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage934); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:405:1: ( (lv_elements_4_0= ruleElement ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||(LA3_0>=14 && LA3_0<=15)||LA3_0==20||(LA3_0>=23 && LA3_0<=28)||(LA3_0>=37 && LA3_0<=48)||(LA3_0>=51 && LA3_0<=53)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:406:1: (lv_elements_4_0= ruleElement )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:406:1: (lv_elements_4_0= ruleElement )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:407:3: lv_elements_4_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_rulePackage955);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage968); 

                	newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:435:1: entryRuleGeneralizationSet returns [EObject current=null] : iv_ruleGeneralizationSet= ruleGeneralizationSet EOF ;
    public final EObject entryRuleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralizationSet = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:436:2: (iv_ruleGeneralizationSet= ruleGeneralizationSet EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:437:2: iv_ruleGeneralizationSet= ruleGeneralizationSet EOF
            {
             newCompositeNode(grammarAccess.getGeneralizationSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet1004);
            iv_ruleGeneralizationSet=ruleGeneralizationSet();

            state._fsp--;

             current =iv_ruleGeneralizationSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGeneralizationSet1014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralizationSet"


    // $ANTLR start "ruleGeneralizationSet"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:444:1: ruleGeneralizationSet returns [EObject current=null] : ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) ;
    public final EObject ruleGeneralizationSet() throws RecognitionException {
        EObject current = null;

        Token lv_isCovering_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:447:28: ( ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:1: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:1: ( ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:2: ( (lv_isCovering_0_0= 'complete' ) )? otherlv_1= 'GeneralizationSet' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'specializes' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'into' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:448:2: ( (lv_isCovering_0_0= 'complete' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:449:1: (lv_isCovering_0_0= 'complete' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:449:1: (lv_isCovering_0_0= 'complete' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:450:3: lv_isCovering_0_0= 'complete'
                    {
                    lv_isCovering_0_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGeneralizationSet1057); 

                            newLeafNode(lv_isCovering_0_0, grammarAccess.getGeneralizationSetAccess().getIsCoveringCompleteKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralizationSetRule());
                    	        }
                           		setWithLastConsumed(current, "isCovering", true, "complete");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGeneralizationSet1083); 

                	newLeafNode(otherlv_1, grammarAccess.getGeneralizationSetAccess().getGeneralizationSetKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:467:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:468:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:468:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:469:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneralizationSet1100); 

            			newLeafNode(lv_name_2_0, grammarAccess.getGeneralizationSetAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGeneralizationSet1117); 

                	newLeafNode(otherlv_3, grammarAccess.getGeneralizationSetAccess().getSpecializesKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:489:1: ( (otherlv_4= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:490:1: (otherlv_4= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:490:1: (otherlv_4= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:491:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneralizationSet1137); 

            		newLeafNode(otherlv_4, grammarAccess.getGeneralizationSetAccess().getSpecializedUniversalUniversalCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGeneralizationSet1149); 

                	newLeafNode(otherlv_5, grammarAccess.getGeneralizationSetAccess().getIntoKeyword_5());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:506:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:507:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:507:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:508:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneralizationSet1169); 

            		newLeafNode(otherlv_6, grammarAccess.getGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_6_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:519:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:519:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGeneralizationSet1182); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGeneralizationSetAccess().getCommaKeyword_7_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:523:1: ( (otherlv_8= RULE_ID ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:524:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:524:1: (otherlv_8= RULE_ID )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:525:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGeneralizationSetRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGeneralizationSet1202); 

            	    		newLeafNode(otherlv_8, grammarAccess.getGeneralizationSetAccess().getSpecializingUniversalsUniversalCrossReference_7_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGeneralizationSet1216); 

                	newLeafNode(otherlv_9, grammarAccess.getGeneralizationSetAccess().getSemicolonKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralizationSet"


    // $ANTLR start "entryRulePrimitiveDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:548:1: entryRulePrimitiveDataType returns [EObject current=null] : iv_rulePrimitiveDataType= rulePrimitiveDataType EOF ;
    public final EObject entryRulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:549:2: (iv_rulePrimitiveDataType= rulePrimitiveDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:550:2: iv_rulePrimitiveDataType= rulePrimitiveDataType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType1252);
            iv_rulePrimitiveDataType=rulePrimitiveDataType();

            state._fsp--;

             current =iv_rulePrimitiveDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDataType1262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataType"


    // $ANTLR start "rulePrimitiveDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:557:1: rulePrimitiveDataType returns [EObject current=null] : (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) ;
    public final EObject rulePrimitiveDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv__type_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:560:28: ( (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:561:1: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:561:1: (otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:561:3: otherlv_0= 'PrimitiveDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv__type_3_0= rulePrimitiveDataTypeType ) ) otherlv_4= ')' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePrimitiveDataType1299); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveDataTypeAccess().getPrimitiveDataTypeKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:565:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:566:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:566:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:567:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePrimitiveDataType1316); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePrimitiveDataType1333); 

                	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDataTypeAccess().getLeftParenthesisKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:587:1: ( (lv__type_3_0= rulePrimitiveDataTypeType ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:588:1: (lv__type_3_0= rulePrimitiveDataTypeType )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:588:1: (lv__type_3_0= rulePrimitiveDataTypeType )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:589:3: lv__type_3_0= rulePrimitiveDataTypeType
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveDataTypeAccess().get_typePrimitiveDataTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataTypeType_in_rulePrimitiveDataType1354);
            lv__type_3_0=rulePrimitiveDataTypeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"_type",
                    		lv__type_3_0, 
                    		"PrimitiveDataTypeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePrimitiveDataType1366); 

                	newLeafNode(otherlv_4, grammarAccess.getPrimitiveDataTypeAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePrimitiveDataType1378); 

                	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDataTypeAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDataType"


    // $ANTLR start "entryRuleComplexDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:621:1: entryRuleComplexDataType returns [EObject current=null] : iv_ruleComplexDataType= ruleComplexDataType EOF ;
    public final EObject entryRuleComplexDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexDataType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:622:2: (iv_ruleComplexDataType= ruleComplexDataType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:623:2: iv_ruleComplexDataType= ruleComplexDataType EOF
            {
             newCompositeNode(grammarAccess.getComplexDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType1414);
            iv_ruleComplexDataType=ruleComplexDataType();

            state._fsp--;

             current =iv_ruleComplexDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComplexDataType1424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexDataType"


    // $ANTLR start "ruleComplexDataType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:630:1: ruleComplexDataType returns [EObject current=null] : (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComplexDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:633:28: ( (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:634:1: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:634:1: (otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:634:3: otherlv_0= 'ComplexDataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleDataTypeAttribute ) ) (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleComplexDataType1461); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexDataTypeAccess().getComplexDataTypeKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:638:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:639:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:639:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:640:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComplexDataType1478); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComplexDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleComplexDataType1495); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexDataTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:660:1: ( (lv_attributes_3_0= ruleDataTypeAttribute ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:661:1: (lv_attributes_3_0= ruleDataTypeAttribute )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:661:1: (lv_attributes_3_0= ruleDataTypeAttribute )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:662:3: lv_attributes_3_0= ruleDataTypeAttribute
            {
             
            	        newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1516);
            lv_attributes_3_0=ruleDataTypeAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	        }
                   		add(
                   			current, 
                   			"attributes",
                    		lv_attributes_3_0, 
                    		"DataTypeAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:678:2: (otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:678:4: otherlv_4= ';' ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComplexDataType1529); 

            	        	newLeafNode(otherlv_4, grammarAccess.getComplexDataTypeAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:682:1: ( (lv_attributes_5_0= ruleDataTypeAttribute ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:683:1: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:683:1: (lv_attributes_5_0= ruleDataTypeAttribute )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:684:3: lv_attributes_5_0= ruleDataTypeAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexDataTypeAccess().getAttributesDataTypeAttributeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1550);
            	    lv_attributes_5_0=ruleDataTypeAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexDataTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_5_0, 
            	            		"DataTypeAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleComplexDataType1564); 

                	newLeafNode(otherlv_6, grammarAccess.getComplexDataTypeAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexDataType"


    // $ANTLR start "entryRuleEnumeration"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:712:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:713:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:714:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration1600);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration1610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:721:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_enumerationLiterals_3_0 = null;

        AntlrDatatypeRuleToken lv_enumerationLiterals_5_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:724:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:725:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:725:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:725:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_enumerationLiterals_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEnumeration1647); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:729:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:730:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:730:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:731:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumeration1664); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEnumeration1681); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:751:1: ( (lv_enumerationLiterals_3_0= ruleEString ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:752:1: (lv_enumerationLiterals_3_0= ruleEString )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:752:1: (lv_enumerationLiterals_3_0= ruleEString )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:753:3: lv_enumerationLiterals_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumeration1702);
            lv_enumerationLiterals_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	        }
                   		add(
                   			current, 
                   			"enumerationLiterals",
                    		lv_enumerationLiterals_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:769:2: (otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:769:4: otherlv_4= ',' ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumeration1715); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	        
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:773:1: ( (lv_enumerationLiterals_5_0= ruleEString ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:774:1: (lv_enumerationLiterals_5_0= ruleEString )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:774:1: (lv_enumerationLiterals_5_0= ruleEString )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:775:3: lv_enumerationLiterals_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationLiteralsEStringParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleEnumeration1736);
            	    lv_enumerationLiterals_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"enumerationLiterals",
            	            		lv_enumerationLiterals_5_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumeration1750); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleMeronymicRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:803:1: entryRuleMeronymicRelation returns [EObject current=null] : iv_ruleMeronymicRelation= ruleMeronymicRelation EOF ;
    public final EObject entryRuleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeronymicRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:804:2: (iv_ruleMeronymicRelation= ruleMeronymicRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:805:2: iv_ruleMeronymicRelation= ruleMeronymicRelation EOF
            {
             newCompositeNode(grammarAccess.getMeronymicRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMeronymicRelation_in_entryRuleMeronymicRelation1786);
            iv_ruleMeronymicRelation=ruleMeronymicRelation();

            state._fsp--;

             current =iv_ruleMeronymicRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMeronymicRelation1796); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeronymicRelation"


    // $ANTLR start "ruleMeronymicRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:812:1: ruleMeronymicRelation returns [EObject current=null] : (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) ;
    public final EObject ruleMeronymicRelation() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentOfRelation_0 = null;

        EObject this_MembershipRelation_1 = null;

        EObject this_SubCollectionRelation_2 = null;

        EObject this_SubQuantityRelation_3 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:815:28: ( (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:816:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:816:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:817:5: this_ComponentOfRelation_0= ruleComponentOfRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getComponentOfRelationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentOfRelation_in_ruleMeronymicRelation1843);
                    this_ComponentOfRelation_0=ruleComponentOfRelation();

                    state._fsp--;

                     
                            current = this_ComponentOfRelation_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:827:5: this_MembershipRelation_1= ruleMembershipRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getMembershipRelationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMembershipRelation_in_ruleMeronymicRelation1870);
                    this_MembershipRelation_1=ruleMembershipRelation();

                    state._fsp--;

                     
                            current = this_MembershipRelation_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:837:5: this_SubCollectionRelation_2= ruleSubCollectionRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubCollectionRelationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubCollectionRelation_in_ruleMeronymicRelation1897);
                    this_SubCollectionRelation_2=ruleSubCollectionRelation();

                    state._fsp--;

                     
                            current = this_SubCollectionRelation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:847:5: this_SubQuantityRelation_3= ruleSubQuantityRelation
                    {
                     
                            newCompositeNode(grammarAccess.getMeronymicRelationAccess().getSubQuantityRelationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubQuantityRelation_in_ruleMeronymicRelation1924);
                    this_SubQuantityRelation_3=ruleSubQuantityRelation();

                    state._fsp--;

                     
                            current = this_SubQuantityRelation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeronymicRelation"


    // $ANTLR start "entryRuleComponentOfRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:863:1: entryRuleComponentOfRelation returns [EObject current=null] : iv_ruleComponentOfRelation= ruleComponentOfRelation EOF ;
    public final EObject entryRuleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentOfRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:864:2: (iv_ruleComponentOfRelation= ruleComponentOfRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:865:2: iv_ruleComponentOfRelation= ruleComponentOfRelation EOF
            {
             newCompositeNode(grammarAccess.getComponentOfRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentOfRelation_in_entryRuleComponentOfRelation1959);
            iv_ruleComponentOfRelation=ruleComponentOfRelation();

            state._fsp--;

             current =iv_ruleComponentOfRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentOfRelation1969); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentOfRelation"


    // $ANTLR start "ruleComponentOfRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:872:1: ruleComponentOfRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleComponentOfRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:875:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:876:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:876:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:876:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isComponentOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:876:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:878:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:878:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:879:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:882:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:883:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:883:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=5;
                int LA9_0 = input.LA(1);

                if ( LA9_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt9=4;
                }


                switch (alt9) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:885:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:885:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:886:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:886:116: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:887:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:890:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:890:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:890:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:891:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:891:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:892:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleComponentOfRelation2057); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getComponentOfRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:912:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:912:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:913:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:913:116: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:914:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:917:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:917:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:917:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:918:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:918:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:919:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleComponentOfRelation2142); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getComponentOfRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:939:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:939:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:940:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:940:116: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:941:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:944:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:944:7: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:944:16: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:945:1: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:945:1: (lv_partIsShareable_3_0= 'shareable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:946:3: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleComponentOfRelation2227); 

            	            newLeafNode(lv_partIsShareable_3_0, grammarAccess.getComponentOfRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:966:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:966:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:967:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:967:116: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:968:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:971:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:971:7: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentOfRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:971:16: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:972:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:972:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:973:3: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleComponentOfRelation2312); 

            	            newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getComponentOfRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleComponentOfRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getComponentOfRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleComponentOfRelation2383); 

                	newLeafNode(otherlv_5, grammarAccess.getComponentOfRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1005:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1006:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1006:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1007:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentOfRelation2403); 

            		newLeafNode(otherlv_6, grammarAccess.getComponentOfRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1018:2: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1018:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentOfRelation2416); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1022:1: ( (lv_sourceLowerBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1023:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1023:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1024:3: lv_sourceLowerBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2437);
                    lv_sourceLowerBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentOfRelation2449); 

                        	newLeafNode(otherlv_9, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1044:1: ( (lv_sourceUpperBound_10_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1045:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1045:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1046:3: lv_sourceUpperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2470);
                    lv_sourceUpperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComponentOfRelation2482); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleComponentOfRelation2496); 

                	newLeafNode(otherlv_12, grammarAccess.getComponentOfRelationAccess().getIsComponentOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1070:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1071:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1071:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1072:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentOfRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComponentOfRelation2516); 

            		newLeafNode(otherlv_13, grammarAccess.getComponentOfRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1083:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1083:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleComponentOfRelation2529); 

                        	newLeafNode(otherlv_14, grammarAccess.getComponentOfRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1087:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1088:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1088:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1089:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2550);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleComponentOfRelation2562); 

                        	newLeafNode(otherlv_16, grammarAccess.getComponentOfRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1109:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1110:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1110:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1111:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getComponentOfRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleComponentOfRelation2583);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComponentOfRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleComponentOfRelation2595); 

                        	newLeafNode(otherlv_18, grammarAccess.getComponentOfRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleComponentOfRelation2609); 

                	newLeafNode(otherlv_19, grammarAccess.getComponentOfRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentOfRelation"


    // $ANTLR start "entryRuleMembershipRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1143:1: entryRuleMembershipRelation returns [EObject current=null] : iv_ruleMembershipRelation= ruleMembershipRelation EOF ;
    public final EObject entryRuleMembershipRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1144:2: (iv_ruleMembershipRelation= ruleMembershipRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1145:2: iv_ruleMembershipRelation= ruleMembershipRelation EOF
            {
             newCompositeNode(grammarAccess.getMembershipRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMembershipRelation_in_entryRuleMembershipRelation2645);
            iv_ruleMembershipRelation=ruleMembershipRelation();

            state._fsp--;

             current =iv_ruleMembershipRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMembershipRelation2655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMembershipRelation"


    // $ANTLR start "ruleMembershipRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1152:1: ruleMembershipRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleMembershipRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1155:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1156:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1156:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1156:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isMemberOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1156:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1158:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1158:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1159:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1162:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1163:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1163:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=5;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt12=4;
                }


                switch (alt12) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1165:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1165:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1166:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1166:115: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1167:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1170:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1170:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1170:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1171:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1171:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1172:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleMembershipRelation2743); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getMembershipRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1192:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1192:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1193:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1193:115: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1194:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1197:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1197:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1197:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1198:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1198:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1199:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleMembershipRelation2828); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getMembershipRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1219:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1219:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1220:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1220:115: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1221:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1224:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1224:7: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1224:16: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1225:1: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1225:1: (lv_partIsShareable_3_0= 'shareable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1226:3: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMembershipRelation2913); 

            	            newLeafNode(lv_partIsShareable_3_0, grammarAccess.getMembershipRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1246:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1246:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1247:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1247:115: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1248:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1251:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1251:7: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMembershipRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1251:16: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1252:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1252:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1253:3: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleMembershipRelation2998); 

            	            newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getMembershipRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleMembershipRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMembershipRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleMembershipRelation3069); 

                	newLeafNode(otherlv_5, grammarAccess.getMembershipRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1285:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1286:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1286:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1287:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMembershipRelation3089); 

            		newLeafNode(otherlv_6, grammarAccess.getMembershipRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1298:2: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1298:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMembershipRelation3102); 

                        	newLeafNode(otherlv_7, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1302:1: ( (lv_sourceLowerBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1303:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1303:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1304:3: lv_sourceLowerBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3123);
                    lv_sourceLowerBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMembershipRelation3135); 

                        	newLeafNode(otherlv_9, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1324:1: ( (lv_sourceUpperBound_10_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1325:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1325:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1326:3: lv_sourceUpperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3156);
                    lv_sourceUpperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMembershipRelation3168); 

                        	newLeafNode(otherlv_11, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleMembershipRelation3182); 

                	newLeafNode(otherlv_12, grammarAccess.getMembershipRelationAccess().getIsMemberOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1350:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1351:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1351:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1352:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMembershipRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMembershipRelation3202); 

            		newLeafNode(otherlv_13, grammarAccess.getMembershipRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1363:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1363:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMembershipRelation3215); 

                        	newLeafNode(otherlv_14, grammarAccess.getMembershipRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1367:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1368:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1368:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1369:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3236);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMembershipRelation3248); 

                        	newLeafNode(otherlv_16, grammarAccess.getMembershipRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1389:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1390:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1390:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1391:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMembershipRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMembershipRelation3269);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMembershipRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMembershipRelation3281); 

                        	newLeafNode(otherlv_18, grammarAccess.getMembershipRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMembershipRelation3295); 

                	newLeafNode(otherlv_19, grammarAccess.getMembershipRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMembershipRelation"


    // $ANTLR start "entryRuleSubCollectionRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1423:1: entryRuleSubCollectionRelation returns [EObject current=null] : iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF ;
    public final EObject entryRuleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCollectionRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1424:2: (iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1425:2: iv_ruleSubCollectionRelation= ruleSubCollectionRelation EOF
            {
             newCompositeNode(grammarAccess.getSubCollectionRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubCollectionRelation_in_entryRuleSubCollectionRelation3331);
            iv_ruleSubCollectionRelation=ruleSubCollectionRelation();

            state._fsp--;

             current =iv_ruleSubCollectionRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubCollectionRelation3341); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubCollectionRelation"


    // $ANTLR start "ruleSubCollectionRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1432:1: ruleSubCollectionRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleSubCollectionRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsShareable_3_0=null;
        Token lv_partIsImmutable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_10_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1435:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1436:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1436:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1436:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= 'relation' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )? otherlv_12= 'isSubCollectionOf' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1436:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1438:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1438:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1439:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1442:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1443:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1443:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=5;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3) ) {
                    alt15=4;
                }


                switch (alt15) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1445:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1445:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1446:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1446:118: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1447:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1450:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1450:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1450:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1451:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1451:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1452:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSubCollectionRelation3429); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getSubCollectionRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1472:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1472:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1473:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1473:118: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1474:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1477:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1477:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1477:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1478:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1478:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1479:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSubCollectionRelation3514); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getSubCollectionRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1499:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1499:4: ({...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1500:5: {...}? => ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1500:118: ( ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1501:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1504:6: ({...}? => ( (lv_partIsShareable_3_0= 'shareable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1504:7: {...}? => ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1504:16: ( (lv_partIsShareable_3_0= 'shareable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1505:1: (lv_partIsShareable_3_0= 'shareable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1505:1: (lv_partIsShareable_3_0= 'shareable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1506:3: lv_partIsShareable_3_0= 'shareable'
            	    {
            	    lv_partIsShareable_3_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSubCollectionRelation3599); 

            	            newLeafNode(lv_partIsShareable_3_0, grammarAccess.getSubCollectionRelationAccess().getPartIsShareableShareableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsShareable", true, "shareable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1526:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1526:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1527:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1527:118: ( ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1528:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1531:6: ({...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1531:7: {...}? => ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubCollectionRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1531:16: ( (lv_partIsImmutable_4_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1532:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1532:1: (lv_partIsImmutable_4_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1533:3: lv_partIsImmutable_4_0= 'immutable'
            	    {
            	    lv_partIsImmutable_4_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubCollectionRelation3684); 

            	            newLeafNode(lv_partIsImmutable_4_0, grammarAccess.getSubCollectionRelationAccess().getPartIsImmutableImmutableKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleSubCollectionRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSubCollectionRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubCollectionRelation3755); 

                	newLeafNode(otherlv_5, grammarAccess.getSubCollectionRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1565:1: ( (otherlv_6= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1566:1: (otherlv_6= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1566:1: (otherlv_6= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1567:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubCollectionRelation3775); 

            		newLeafNode(otherlv_6, grammarAccess.getSubCollectionRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1578:2: (otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1578:4: otherlv_7= '[' ( (lv_sourceLowerBound_8_0= ruleEInt ) ) otherlv_9= '..' ( (lv_sourceUpperBound_10_0= ruleEInt ) ) otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubCollectionRelation3788); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1582:1: ( (lv_sourceLowerBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1583:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1583:1: (lv_sourceLowerBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1584:3: lv_sourceLowerBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation3809);
                    lv_sourceLowerBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubCollectionRelation3821); 

                        	newLeafNode(otherlv_9, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1604:1: ( (lv_sourceUpperBound_10_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1605:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1605:1: (lv_sourceUpperBound_10_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1606:3: lv_sourceUpperBound_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation3842);
                    lv_sourceUpperBound_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubCollectionRelation3854); 

                        	newLeafNode(otherlv_11, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSubCollectionRelation3868); 

                	newLeafNode(otherlv_12, grammarAccess.getSubCollectionRelationAccess().getIsSubCollectionOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1630:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1631:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1631:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1632:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubCollectionRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubCollectionRelation3888); 

            		newLeafNode(otherlv_13, grammarAccess.getSubCollectionRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1643:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1643:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubCollectionRelation3901); 

                        	newLeafNode(otherlv_14, grammarAccess.getSubCollectionRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1647:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1648:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1648:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1649:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation3922);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubCollectionRelation3934); 

                        	newLeafNode(otherlv_16, grammarAccess.getSubCollectionRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1669:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1670:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1670:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1671:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubCollectionRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubCollectionRelation3955);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubCollectionRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubCollectionRelation3967); 

                        	newLeafNode(otherlv_18, grammarAccess.getSubCollectionRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubCollectionRelation3981); 

                	newLeafNode(otherlv_19, grammarAccess.getSubCollectionRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubCollectionRelation"


    // $ANTLR start "entryRuleSubQuantityRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1703:1: entryRuleSubQuantityRelation returns [EObject current=null] : iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF ;
    public final EObject entryRuleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubQuantityRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1704:2: (iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1705:2: iv_ruleSubQuantityRelation= ruleSubQuantityRelation EOF
            {
             newCompositeNode(grammarAccess.getSubQuantityRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubQuantityRelation_in_entryRuleSubQuantityRelation4017);
            iv_ruleSubQuantityRelation=ruleSubQuantityRelation();

            state._fsp--;

             current =iv_ruleSubQuantityRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubQuantityRelation4027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubQuantityRelation"


    // $ANTLR start "ruleSubQuantityRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1712:1: ruleSubQuantityRelation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' ) ;
    public final EObject ruleSubQuantityRelation() throws RecognitionException {
        EObject current = null;

        Token lv_partIsEssential_1_0=null;
        Token lv_partIsInseparable_2_0=null;
        Token lv_partIsImmutable_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_16_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1715:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1716:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1716:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1716:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'relation' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )? otherlv_11= 'isSubQuantityOf' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )? otherlv_18= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1716:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1718:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1718:1: ( ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1719:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1722:2: ( ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?)
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1723:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+ {...}?
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1723:3: ( ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=4;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2) ) {
                    alt18=3;
                }


                switch (alt18) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1725:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1725:4: ({...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1726:5: {...}? => ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1726:116: ( ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1727:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1730:6: ({...}? => ( (lv_partIsEssential_1_0= 'essential' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1730:7: {...}? => ( (lv_partIsEssential_1_0= 'essential' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1730:16: ( (lv_partIsEssential_1_0= 'essential' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1731:1: (lv_partIsEssential_1_0= 'essential' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1731:1: (lv_partIsEssential_1_0= 'essential' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1732:3: lv_partIsEssential_1_0= 'essential'
            	    {
            	    lv_partIsEssential_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSubQuantityRelation4115); 

            	            newLeafNode(lv_partIsEssential_1_0, grammarAccess.getSubQuantityRelationAccess().getPartIsEssentialEssentialKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsEssential", true, "essential");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1752:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1752:4: ({...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1753:5: {...}? => ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1753:116: ( ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1754:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1757:6: ({...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1757:7: {...}? => ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1757:16: ( (lv_partIsInseparable_2_0= 'inseparable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1758:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1758:1: (lv_partIsInseparable_2_0= 'inseparable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1759:3: lv_partIsInseparable_2_0= 'inseparable'
            	    {
            	    lv_partIsInseparable_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSubQuantityRelation4200); 

            	            newLeafNode(lv_partIsInseparable_2_0, grammarAccess.getSubQuantityRelationAccess().getPartIsInseparableInseparableKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsInseparable", true, "inseparable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1779:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1779:4: ({...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1780:5: {...}? => ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canSelect(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1780:116: ( ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1781:6: ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1784:6: ({...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1784:7: {...}? => ( (lv_partIsImmutable_3_0= 'immutable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSubQuantityRelation", "true");
            	    }
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1784:16: ( (lv_partIsImmutable_3_0= 'immutable' ) )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1785:1: (lv_partIsImmutable_3_0= 'immutable' )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1785:1: (lv_partIsImmutable_3_0= 'immutable' )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1786:3: lv_partIsImmutable_3_0= 'immutable'
            	    {
            	    lv_partIsImmutable_3_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSubQuantityRelation4285); 

            	            newLeafNode(lv_partIsImmutable_3_0, grammarAccess.getSubQuantityRelationAccess().getPartIsImmutableImmutableKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	    	        }
            	           		setWithLastConsumed(current, "partIsImmutable", true, "immutable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleSubQuantityRelation", "getUnorderedGroupHelper().canLeave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSubQuantityRelationAccess().getUnorderedGroup_0());
            	

            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSubQuantityRelation4356); 

                	newLeafNode(otherlv_4, grammarAccess.getSubQuantityRelationAccess().getRelationKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1818:1: ( (otherlv_5= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1819:1: (otherlv_5= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1819:1: (otherlv_5= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1820:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubQuantityRelation4376); 

            		newLeafNode(otherlv_5, grammarAccess.getSubQuantityRelationAccess().getPartSubstantialUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1831:2: (otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1831:4: otherlv_6= '[' ( (lv_sourceLowerBound_7_0= ruleEInt ) ) otherlv_8= '..' ( (lv_sourceUpperBound_9_0= ruleEInt ) ) otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubQuantityRelation4389); 

                        	newLeafNode(otherlv_6, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1835:1: ( (lv_sourceLowerBound_7_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1836:1: (lv_sourceLowerBound_7_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1836:1: (lv_sourceLowerBound_7_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1837:3: lv_sourceLowerBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4410);
                    lv_sourceLowerBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubQuantityRelation4422); 

                        	newLeafNode(otherlv_8, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1857:1: ( (lv_sourceUpperBound_9_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1858:1: (lv_sourceUpperBound_9_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1858:1: (lv_sourceUpperBound_9_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1859:3: lv_sourceUpperBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4443);
                    lv_sourceUpperBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubQuantityRelation4455); 

                        	newLeafNode(otherlv_10, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSubQuantityRelation4469); 

                	newLeafNode(otherlv_11, grammarAccess.getSubQuantityRelationAccess().getIsSubQuantityOfKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1883:1: ( (otherlv_12= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1884:1: (otherlv_12= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1884:1: (otherlv_12= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1885:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubQuantityRelationRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubQuantityRelation4489); 

            		newLeafNode(otherlv_12, grammarAccess.getSubQuantityRelationAccess().getWholeSubstantialUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1896:2: (otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1896:4: otherlv_13= '[' ( (lv_targetLowerBound_14_0= ruleEInt ) ) otherlv_15= '..' ( (lv_targetUpperBound_16_0= ruleEInt ) ) otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSubQuantityRelation4502); 

                        	newLeafNode(otherlv_13, grammarAccess.getSubQuantityRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1900:1: ( (lv_targetLowerBound_14_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1901:1: (lv_targetLowerBound_14_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1901:1: (lv_targetLowerBound_14_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1902:3: lv_targetLowerBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4523);
                    lv_targetLowerBound_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSubQuantityRelation4535); 

                        	newLeafNode(otherlv_15, grammarAccess.getSubQuantityRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1922:1: ( (lv_targetUpperBound_16_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1923:1: (lv_targetUpperBound_16_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1923:1: (lv_targetUpperBound_16_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1924:3: lv_targetUpperBound_16_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubQuantityRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSubQuantityRelation4556);
                    lv_targetUpperBound_16_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubQuantityRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_16_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_17=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubQuantityRelation4568); 

                        	newLeafNode(otherlv_17, grammarAccess.getSubQuantityRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSubQuantityRelation4582); 

                	newLeafNode(otherlv_18, grammarAccess.getSubQuantityRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubQuantityRelation"


    // $ANTLR start "entryRuleKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1956:1: entryRuleKind returns [EObject current=null] : iv_ruleKind= ruleKind EOF ;
    public final EObject entryRuleKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1957:2: (iv_ruleKind= ruleKind EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1958:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleKind_in_entryRuleKind4618);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKind4628); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1965:1: ruleKind returns [EObject current=null] : ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1968:28: ( ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1969:1: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1969:1: ( () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1969:2: () otherlv_1= 'Kind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1969:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1970:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getKindAccess().getKindAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleKind4674); 

                	newLeafNode(otherlv_1, grammarAccess.getKindAccess().getKindKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1979:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1980:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1980:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:1981:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKind4691); 

            			newLeafNode(lv_name_2_0, grammarAccess.getKindAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleKind4708); 

                	newLeafNode(otherlv_3, grammarAccess.getKindAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2001:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30||LA21_0==59) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2002:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2002:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2003:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleKind4729);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getKindRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleKind4742); 

                	newLeafNode(otherlv_5, grammarAccess.getKindAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleQuantityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2031:1: entryRuleQuantityUniversal returns [EObject current=null] : iv_ruleQuantityUniversal= ruleQuantityUniversal EOF ;
    public final EObject entryRuleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantityUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2032:2: (iv_ruleQuantityUniversal= ruleQuantityUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2033:2: iv_ruleQuantityUniversal= ruleQuantityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQuantityUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuantityUniversal_in_entryRuleQuantityUniversal4778);
            iv_ruleQuantityUniversal=ruleQuantityUniversal();

            state._fsp--;

             current =iv_ruleQuantityUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuantityUniversal4788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantityUniversal"


    // $ANTLR start "ruleQuantityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2040:1: ruleQuantityUniversal returns [EObject current=null] : ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleQuantityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2043:28: ( ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2044:1: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2044:1: ( () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2044:2: () otherlv_1= 'Quantity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2044:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2045:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQuantityUniversalAccess().getQuantityUniversalAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleQuantityUniversal4834); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantityUniversalAccess().getQuantityKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2054:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2055:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2055:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2056:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQuantityUniversal4851); 

            			newLeafNode(lv_name_2_0, grammarAccess.getQuantityUniversalAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuantityUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQuantityUniversal4868); 

                	newLeafNode(otherlv_3, grammarAccess.getQuantityUniversalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2076:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30||LA22_0==59) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2077:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2077:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2078:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleQuantityUniversal4889);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantityUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQuantityUniversal4902); 

                	newLeafNode(otherlv_5, grammarAccess.getQuantityUniversalAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantityUniversal"


    // $ANTLR start "entryRuleCollectiveUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2106:1: entryRuleCollectiveUniversal returns [EObject current=null] : iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF ;
    public final EObject entryRuleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectiveUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2107:2: (iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2108:2: iv_ruleCollectiveUniversal= ruleCollectiveUniversal EOF
            {
             newCompositeNode(grammarAccess.getCollectiveUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCollectiveUniversal_in_entryRuleCollectiveUniversal4938);
            iv_ruleCollectiveUniversal=ruleCollectiveUniversal();

            state._fsp--;

             current =iv_ruleCollectiveUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCollectiveUniversal4948); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectiveUniversal"


    // $ANTLR start "ruleCollectiveUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2115:1: ruleCollectiveUniversal returns [EObject current=null] : ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleCollectiveUniversal() throws RecognitionException {
        EObject current = null;

        Token lv_isExtensional_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2118:28: ( ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2119:1: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2119:1: ( ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2119:2: ( (lv_isExtensional_0_0= 'extensional' ) )? otherlv_1= 'CollectiveUniversal' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2119:2: ( (lv_isExtensional_0_0= 'extensional' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2120:1: (lv_isExtensional_0_0= 'extensional' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2120:1: (lv_isExtensional_0_0= 'extensional' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2121:3: lv_isExtensional_0_0= 'extensional'
                    {
                    lv_isExtensional_0_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCollectiveUniversal4991); 

                            newLeafNode(lv_isExtensional_0_0, grammarAccess.getCollectiveUniversalAccess().getIsExtensionalExtensionalKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectiveUniversalRule());
                    	        }
                           		setWithLastConsumed(current, "isExtensional", true, "extensional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleCollectiveUniversal5017); 

                	newLeafNode(otherlv_1, grammarAccess.getCollectiveUniversalAccess().getCollectiveUniversalKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2138:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2139:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2139:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2140:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCollectiveUniversal5034); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCollectiveUniversalAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCollectiveUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCollectiveUniversal5051); 

                	newLeafNode(otherlv_3, grammarAccess.getCollectiveUniversalAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2160:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30||LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2161:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2161:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2162:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCollectiveUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleCollectiveUniversal5072);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCollectiveUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCollectiveUniversal5085); 

                	newLeafNode(otherlv_5, grammarAccess.getCollectiveUniversalAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectiveUniversal"


    // $ANTLR start "entryRuleSubKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2190:1: entryRuleSubKind returns [EObject current=null] : iv_ruleSubKind= ruleSubKind EOF ;
    public final EObject entryRuleSubKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubKind = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2191:2: (iv_ruleSubKind= ruleSubKind EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2192:2: iv_ruleSubKind= ruleSubKind EOF
            {
             newCompositeNode(grammarAccess.getSubKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubKind_in_entryRuleSubKind5121);
            iv_ruleSubKind=ruleSubKind();

            state._fsp--;

             current =iv_ruleSubKind; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubKind5131); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubKind"


    // $ANTLR start "ruleSubKind"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2199:1: ruleSubKind returns [EObject current=null] : ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject ruleSubKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2202:28: ( ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2203:1: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2203:1: ( () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2203:2: () otherlv_1= 'SubKind' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2203:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2204:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubKindAccess().getSubKindAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSubKind5177); 

                	newLeafNode(otherlv_1, grammarAccess.getSubKindAccess().getSubKindKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2213:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2214:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2214:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2215:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubKind5194); 

            			newLeafNode(lv_name_2_0, grammarAccess.getSubKindAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubKindRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSubKind5211); 

                	newLeafNode(otherlv_3, grammarAccess.getSubKindAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2235:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30||LA25_0==59) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2236:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2236:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2237:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubKindAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleSubKind5232);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubKindRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSubKind5245); 

                	newLeafNode(otherlv_5, grammarAccess.getSubKindAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubKind"


    // $ANTLR start "entryRuleRole"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2265:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2266:2: (iv_ruleRole= ruleRole EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2267:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRole_in_entryRuleRole5281);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRole5291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2274:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2277:28: ( (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2278:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2278:1: (otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2278:3: otherlv_0= 'Role' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleRole5328); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2282:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2283:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2283:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2284:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRole5345); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRole5362); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2304:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30||LA26_0==59) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2305:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2305:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2306:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleRole5383);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRole5396); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRulePhase"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2334:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2335:2: (iv_rulePhase= rulePhase EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2336:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePhase_in_entryRulePhase5432);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePhase5442); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2343:1: rulePhase returns [EObject current=null] : ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2346:28: ( ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2347:1: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2347:1: ( () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2347:2: () otherlv_1= 'Phase' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_characterizedBy_4_0= ruleCharacterization ) )* otherlv_5= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2347:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2348:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhaseAccess().getPhaseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_rulePhase5488); 

                	newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getPhaseKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2357:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2358:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2358:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2359:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePhase5505); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPhaseAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePhase5522); 

                	newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getLeftCurlyBracketKeyword_3());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2379:1: ( (lv_characterizedBy_4_0= ruleCharacterization ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30||LA27_0==59) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2380:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2380:1: (lv_characterizedBy_4_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2381:3: lv_characterizedBy_4_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPhaseAccess().getCharacterizedByCharacterizationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_rulePhase5543);
            	    lv_characterizedBy_4_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPhaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_4_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePhase5556); 

                	newLeafNode(otherlv_5, grammarAccess.getPhaseAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleCategory"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2409:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2410:2: (iv_ruleCategory= ruleCategory EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2411:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_entryRuleCategory5592);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCategory5602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2418:1: ruleCategory returns [EObject current=null] : ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2421:28: ( ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2422:1: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2422:1: ( () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2422:2: () otherlv_1= 'Category' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2422:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2423:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCategoryAccess().getCategoryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleCategory5648); 

                	newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2432:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2433:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2433:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2434:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCategory5665); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCategory5682); 

                	newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCategory5694); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2466:1: entryRuleMixin returns [EObject current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final EObject entryRuleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2467:2: (iv_ruleMixin= ruleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2468:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMixin_in_entryRuleMixin5730);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMixin5740); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2475:1: ruleMixin returns [EObject current=null] : ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2478:28: ( ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2479:1: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2479:1: ( () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2479:2: () otherlv_1= 'Mixin' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2479:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2480:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMixinAccess().getMixinAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleMixin5786); 

                	newLeafNode(otherlv_1, grammarAccess.getMixinAccess().getMixinKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2489:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2490:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2490:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2491:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMixin5803); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMixinAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMixinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMixin5820); 

                	newLeafNode(otherlv_3, grammarAccess.getMixinAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMixin5832); 

                	newLeafNode(otherlv_4, grammarAccess.getMixinAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleRoleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2523:1: entryRuleRoleMixin returns [EObject current=null] : iv_ruleRoleMixin= ruleRoleMixin EOF ;
    public final EObject entryRuleRoleMixin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleMixin = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2524:2: (iv_ruleRoleMixin= ruleRoleMixin EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2525:2: iv_ruleRoleMixin= ruleRoleMixin EOF
            {
             newCompositeNode(grammarAccess.getRoleMixinRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin5868);
            iv_ruleRoleMixin=ruleRoleMixin();

            state._fsp--;

             current =iv_ruleRoleMixin; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoleMixin5878); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleMixin"


    // $ANTLR start "ruleRoleMixin"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2532:1: ruleRoleMixin returns [EObject current=null] : (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleRoleMixin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2535:28: ( (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2536:1: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2536:1: (otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2536:3: otherlv_0= 'RoleMixin' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRoleMixin5915); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleMixinAccess().getRoleMixinKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2540:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2541:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2541:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2542:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRoleMixin5932); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleMixinAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleMixinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRoleMixin5949); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleMixinAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRoleMixin5961); 

                	newLeafNode(otherlv_3, grammarAccess.getRoleMixinAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleMixin"


    // $ANTLR start "entryRuleRelatorUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2574:1: entryRuleRelatorUniversal returns [EObject current=null] : iv_ruleRelatorUniversal= ruleRelatorUniversal EOF ;
    public final EObject entryRuleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelatorUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2575:2: (iv_ruleRelatorUniversal= ruleRelatorUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2576:2: iv_ruleRelatorUniversal= ruleRelatorUniversal EOF
            {
             newCompositeNode(grammarAccess.getRelatorUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRelatorUniversal_in_entryRuleRelatorUniversal5997);
            iv_ruleRelatorUniversal=ruleRelatorUniversal();

            state._fsp--;

             current =iv_ruleRelatorUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelatorUniversal6007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelatorUniversal"


    // $ANTLR start "ruleRelatorUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2583:1: ruleRelatorUniversal returns [EObject current=null] : (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) ;
    public final EObject ruleRelatorUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_characterizedBy_3_0 = null;

        EObject lv_mediations_4_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2586:28: ( (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2587:1: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2587:1: (otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2587:3: otherlv_0= 'RelatorUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* ( (lv_mediations_4_0= ruleMediation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRelatorUniversal6044); 

                	newLeafNode(otherlv_0, grammarAccess.getRelatorUniversalAccess().getRelatorUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2591:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2592:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2592:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2593:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelatorUniversal6061); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRelatorUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRelatorUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRelatorUniversal6078); 

                	newLeafNode(otherlv_2, grammarAccess.getRelatorUniversalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2613:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30||LA28_0==59) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2614:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2614:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2615:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatorUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleRelatorUniversal6099);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2631:3: ( (lv_mediations_4_0= ruleMediation ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==60) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2632:1: (lv_mediations_4_0= ruleMediation )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2632:1: (lv_mediations_4_0= ruleMediation )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2633:3: lv_mediations_4_0= ruleMediation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatorUniversalAccess().getMediationsMediationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMediation_in_ruleRelatorUniversal6121);
            	    lv_mediations_4_0=ruleMediation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatorUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mediations",
            	            		lv_mediations_4_0, 
            	            		"Mediation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRelatorUniversal6134); 

                	newLeafNode(otherlv_5, grammarAccess.getRelatorUniversalAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelatorUniversal"


    // $ANTLR start "entryRuleBinaryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2661:1: entryRuleBinaryMaterialRelation returns [EObject current=null] : iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF ;
    public final EObject entryRuleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryMaterialRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2662:2: (iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2663:2: iv_ruleBinaryMaterialRelation= ruleBinaryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryMaterialRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryMaterialRelation_in_entryRuleBinaryMaterialRelation6170);
            iv_ruleBinaryMaterialRelation=ruleBinaryMaterialRelation();

            state._fsp--;

             current =iv_ruleBinaryMaterialRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryMaterialRelation6180); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryMaterialRelation"


    // $ANTLR start "ruleBinaryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2670:1: ruleBinaryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) ;
    public final EObject ruleBinaryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_15_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_17_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2673:28: ( (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2674:1: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2674:1: (otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2674:3: otherlv_0= 'material' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )? otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )? otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBinaryMaterialRelation6217); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryMaterialRelationAccess().getMaterialKeyword_0());
                
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBinaryMaterialRelation6229); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryMaterialRelationAccess().getRelKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2682:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2683:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2683:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2684:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6249); 

            		newLeafNode(otherlv_2, grammarAccess.getBinaryMaterialRelationAccess().getSourceExternallyDependentUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2695:2: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2695:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryMaterialRelation6262); 

                        	newLeafNode(otherlv_3, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2699:1: ( (lv_sourceLowerBound_4_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2700:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2700:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2701:3: lv_sourceLowerBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6283);
                    lv_sourceLowerBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryMaterialRelation6295); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2721:1: ( (lv_sourceUpperBound_6_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2722:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2722:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2723:3: lv_sourceUpperBound_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6316);
                    lv_sourceUpperBound_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryMaterialRelation6328); 

                        	newLeafNode(otherlv_7, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2743:3: ( (lv_name_8_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2744:1: (lv_name_8_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2744:1: (lv_name_8_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2745:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6347); 

            			newLeafNode(lv_name_8_0, grammarAccess.getBinaryMaterialRelationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2761:2: (otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2761:4: otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBinaryMaterialRelation6365); 

                        	newLeafNode(otherlv_9, grammarAccess.getBinaryMaterialRelationAccess().getLeftParenthesisKeyword_5_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2765:1: ( (otherlv_10= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2766:1: (otherlv_10= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2766:1: (otherlv_10= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2767:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6385); 

                    		newLeafNode(otherlv_10, grammarAccess.getBinaryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_5_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBinaryMaterialRelation6397); 

                        	newLeafNode(otherlv_11, grammarAccess.getBinaryMaterialRelationAccess().getRightParenthesisKeyword_5_2());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleBinaryMaterialRelation6411); 

                	newLeafNode(otherlv_12, grammarAccess.getBinaryMaterialRelationAccess().getTargetKeyword_6());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2786:1: ( (otherlv_13= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2787:1: (otherlv_13= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2787:1: (otherlv_13= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2788:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryMaterialRelationRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6431); 

            		newLeafNode(otherlv_13, grammarAccess.getBinaryMaterialRelationAccess().getTargetExternallyDependentUniversalCrossReference_7_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2799:2: (otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2799:4: otherlv_14= '[' ( (lv_targetLowerBound_15_0= ruleEInt ) ) otherlv_16= '..' ( (lv_targetUpperBound_17_0= ruleEInt ) ) otherlv_18= ']'
                    {
                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryMaterialRelation6444); 

                        	newLeafNode(otherlv_14, grammarAccess.getBinaryMaterialRelationAccess().getLeftSquareBracketKeyword_8_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2803:1: ( (lv_targetLowerBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2804:1: (lv_targetLowerBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2804:1: (lv_targetLowerBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2805:3: lv_targetLowerBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetLowerBoundEIntParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6465);
                    lv_targetLowerBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryMaterialRelation6477); 

                        	newLeafNode(otherlv_16, grammarAccess.getBinaryMaterialRelationAccess().getFullStopFullStopKeyword_8_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2825:1: ( (lv_targetUpperBound_17_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2826:1: (lv_targetUpperBound_17_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2826:1: (lv_targetUpperBound_17_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2827:3: lv_targetUpperBound_17_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryMaterialRelationAccess().getTargetUpperBoundEIntParserRuleCall_8_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6498);
                    lv_targetUpperBound_17_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryMaterialRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_17_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryMaterialRelation6510); 

                        	newLeafNode(otherlv_18, grammarAccess.getBinaryMaterialRelationAccess().getRightSquareBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryMaterialRelation6524); 

                	newLeafNode(otherlv_19, grammarAccess.getBinaryMaterialRelationAccess().getSemicolonKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryMaterialRelation"


    // $ANTLR start "entryRuleBinaryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2859:1: entryRuleBinaryFormalRelation returns [EObject current=null] : iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF ;
    public final EObject entryRuleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryFormalRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2860:2: (iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2861:2: iv_ruleBinaryFormalRelation= ruleBinaryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getBinaryFormalRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinaryFormalRelation_in_entryRuleBinaryFormalRelation6560);
            iv_ruleBinaryFormalRelation=ruleBinaryFormalRelation();

            state._fsp--;

             current =iv_ruleBinaryFormalRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinaryFormalRelation6570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryFormalRelation"


    // $ANTLR start "ruleBinaryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2868:1: ruleBinaryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' ) ;
    public final EObject ruleBinaryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_6_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_11_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_13_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2871:28: ( (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2872:1: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2872:1: (otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2872:3: otherlv_0= 'formal' otherlv_1= 'rel' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )? ( (lv_name_8_0= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )? otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleBinaryFormalRelation6607); 

                	newLeafNode(otherlv_0, grammarAccess.getBinaryFormalRelationAccess().getFormalKeyword_0());
                
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleBinaryFormalRelation6619); 

                	newLeafNode(otherlv_1, grammarAccess.getBinaryFormalRelationAccess().getRelKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2880:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2881:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2881:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2882:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6639); 

            		newLeafNode(otherlv_2, grammarAccess.getBinaryFormalRelationAccess().getSourceUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2893:2: (otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2893:4: otherlv_3= '[' ( (lv_sourceLowerBound_4_0= ruleEInt ) ) otherlv_5= '..' ( (lv_sourceUpperBound_6_0= ruleEInt ) ) otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryFormalRelation6652); 

                        	newLeafNode(otherlv_3, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2897:1: ( (lv_sourceLowerBound_4_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2898:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2898:1: (lv_sourceLowerBound_4_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2899:3: lv_sourceLowerBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6673);
                    lv_sourceLowerBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryFormalRelation6685); 

                        	newLeafNode(otherlv_5, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2919:1: ( (lv_sourceUpperBound_6_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2920:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2920:1: (lv_sourceUpperBound_6_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2921:3: lv_sourceUpperBound_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6706);
                    lv_sourceUpperBound_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryFormalRelation6718); 

                        	newLeafNode(otherlv_7, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2941:3: ( (lv_name_8_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2942:1: (lv_name_8_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2942:1: (lv_name_8_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2943:3: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6737); 

            			newLeafNode(lv_name_8_0, grammarAccess.getBinaryFormalRelationAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2959:2: ( (otherlv_9= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2960:1: (otherlv_9= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2960:1: (otherlv_9= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2961:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBinaryFormalRelationRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6762); 

            		newLeafNode(otherlv_9, grammarAccess.getBinaryFormalRelationAccess().getTargetUniversalCrossReference_5_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2972:2: (otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2972:4: otherlv_10= '[' ( (lv_targetLowerBound_11_0= ruleEInt ) ) otherlv_12= '..' ( (lv_targetUpperBound_13_0= ruleEInt ) ) otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleBinaryFormalRelation6775); 

                        	newLeafNode(otherlv_10, grammarAccess.getBinaryFormalRelationAccess().getLeftSquareBracketKeyword_6_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2976:1: ( (lv_targetLowerBound_11_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2977:1: (lv_targetLowerBound_11_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2977:1: (lv_targetLowerBound_11_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2978:3: lv_targetLowerBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetLowerBoundEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6796);
                    lv_targetLowerBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleBinaryFormalRelation6808); 

                        	newLeafNode(otherlv_12, grammarAccess.getBinaryFormalRelationAccess().getFullStopFullStopKeyword_6_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2998:1: ( (lv_targetUpperBound_13_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2999:1: (lv_targetUpperBound_13_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:2999:1: (lv_targetUpperBound_13_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3000:3: lv_targetUpperBound_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getBinaryFormalRelationAccess().getTargetUpperBoundEIntParserRuleCall_6_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6829);
                    lv_targetUpperBound_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBinaryFormalRelationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleBinaryFormalRelation6841); 

                        	newLeafNode(otherlv_14, grammarAccess.getBinaryFormalRelationAccess().getRightSquareBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBinaryFormalRelation6855); 

                	newLeafNode(otherlv_15, grammarAccess.getBinaryFormalRelationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryFormalRelation"


    // $ANTLR start "entryRuleModeUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3032:1: entryRuleModeUniversal returns [EObject current=null] : iv_ruleModeUniversal= ruleModeUniversal EOF ;
    public final EObject entryRuleModeUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3033:2: (iv_ruleModeUniversal= ruleModeUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3034:2: iv_ruleModeUniversal= ruleModeUniversal EOF
            {
             newCompositeNode(grammarAccess.getModeUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModeUniversal_in_entryRuleModeUniversal6891);
            iv_ruleModeUniversal=ruleModeUniversal();

            state._fsp--;

             current =iv_ruleModeUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModeUniversal6901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeUniversal"


    // $ANTLR start "ruleModeUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3041:1: ruleModeUniversal returns [EObject current=null] : (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) ;
    public final EObject ruleModeUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_characterizedBy_3_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3044:28: ( (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3045:1: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3045:1: (otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3045:3: otherlv_0= 'ModeUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_characterizedBy_3_0= ruleCharacterization ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleModeUniversal6938); 

                	newLeafNode(otherlv_0, grammarAccess.getModeUniversalAccess().getModeUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3049:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3050:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3050:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3051:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModeUniversal6955); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModeUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModeUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModeUniversal6972); 

                	newLeafNode(otherlv_2, grammarAccess.getModeUniversalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3071:1: ( (lv_characterizedBy_3_0= ruleCharacterization ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30||LA35_0==59) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3072:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3072:1: (lv_characterizedBy_3_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3073:3: lv_characterizedBy_3_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModeUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleModeUniversal6993);
            	    lv_characterizedBy_3_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModeUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_3_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModeUniversal7006); 

                	newLeafNode(otherlv_4, grammarAccess.getModeUniversalAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeUniversal"


    // $ANTLR start "entryRuleQualityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3101:1: entryRuleQualityUniversal returns [EObject current=null] : iv_ruleQualityUniversal= ruleQualityUniversal EOF ;
    public final EObject entryRuleQualityUniversal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityUniversal = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3102:2: (iv_ruleQualityUniversal= ruleQualityUniversal EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3103:2: iv_ruleQualityUniversal= ruleQualityUniversal EOF
            {
             newCompositeNode(grammarAccess.getQualityUniversalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualityUniversal_in_entryRuleQualityUniversal7042);
            iv_ruleQualityUniversal=ruleQualityUniversal();

            state._fsp--;

             current =iv_ruleQualityUniversal; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualityUniversal7052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualityUniversal"


    // $ANTLR start "ruleQualityUniversal"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3110:1: ruleQualityUniversal returns [EObject current=null] : (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) ;
    public final EObject ruleQualityUniversal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_characterizedBy_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3113:28: ( (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3114:1: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3114:1: (otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3114:3: otherlv_0= 'QualityUniversal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'characterizes' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )? ( (lv_characterizedBy_11_0= ruleCharacterization ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleQualityUniversal7089); 

                	newLeafNode(otherlv_0, grammarAccess.getQualityUniversalAccess().getQualityUniversalKeyword_0());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3118:1: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3119:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3119:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3120:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7106); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQualityUniversalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityUniversalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleQualityUniversal7123); 

                	newLeafNode(otherlv_2, grammarAccess.getQualityUniversalAccess().getCharacterizesKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3140:1: ( (otherlv_3= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3141:1: (otherlv_3= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3141:1: (otherlv_3= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3142:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQualityUniversalRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7143); 

            		newLeafNode(otherlv_3, grammarAccess.getQualityUniversalAccess().getCharacterizationCharacterizationCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleQualityUniversal7155); 

                	newLeafNode(otherlv_4, grammarAccess.getQualityUniversalAccess().getLeftCurlyBracketKeyword_4());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3157:1: (otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3157:3: otherlv_5= 'datatypes' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleQualityUniversal7168); 

                        	newLeafNode(otherlv_5, grammarAccess.getQualityUniversalAccess().getDatatypesKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleQualityUniversal7180); 

                        	newLeafNode(otherlv_6, grammarAccess.getQualityUniversalAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3165:1: ( (otherlv_7= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3166:1: (otherlv_7= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3166:1: (otherlv_7= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3167:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7200); 

                    		newLeafNode(otherlv_7, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_2_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3178:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3178:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleQualityUniversal7213); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getQualityUniversalAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3182:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3183:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3183:1: (otherlv_9= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3184:3: otherlv_9= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getQualityUniversalRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualityUniversal7233); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getQualityUniversalAccess().getDatatypesDataTypeCrossReference_5_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleQualityUniversal7247); 

                        	newLeafNode(otherlv_10, grammarAccess.getQualityUniversalAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3199:3: ( (lv_characterizedBy_11_0= ruleCharacterization ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==30||LA38_0==59) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3200:1: (lv_characterizedBy_11_0= ruleCharacterization )
            	    {
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3200:1: (lv_characterizedBy_11_0= ruleCharacterization )
            	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3201:3: lv_characterizedBy_11_0= ruleCharacterization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualityUniversalAccess().getCharacterizedByCharacterizationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_ruleQualityUniversal7270);
            	    lv_characterizedBy_11_0=ruleCharacterization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualityUniversalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characterizedBy",
            	            		lv_characterizedBy_11_0, 
            	            		"Characterization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleQualityUniversal7283); 

                	newLeafNode(otherlv_12, grammarAccess.getQualityUniversalAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualityUniversal"


    // $ANTLR start "entryRulenAryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3229:1: entryRulenAryMaterialRelation returns [EObject current=null] : iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF ;
    public final EObject entryRulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryMaterialRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3230:2: (iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3231:2: iv_rulenAryMaterialRelation= rulenAryMaterialRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryMaterialRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulenAryMaterialRelation_in_entryRulenAryMaterialRelation7319);
            iv_rulenAryMaterialRelation=rulenAryMaterialRelation();

            state._fsp--;

             current =iv_rulenAryMaterialRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenAryMaterialRelation7329); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenAryMaterialRelation"


    // $ANTLR start "rulenAryMaterialRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3238:1: rulenAryMaterialRelation returns [EObject current=null] : (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) ;
    public final EObject rulenAryMaterialRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_6_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_8_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_13_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_15_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3241:28: ( (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3242:1: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3242:1: (otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3242:3: otherlv_0= 'material' otherlv_1= 'assoc' ( (otherlv_2= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) ) ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )? otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_rulenAryMaterialRelation7366); 

                	newLeafNode(otherlv_0, grammarAccess.getNAryMaterialRelationAccess().getMaterialKeyword_0());
                
            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulenAryMaterialRelation7378); 

                	newLeafNode(otherlv_1, grammarAccess.getNAryMaterialRelationAccess().getAssocKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3250:1: ( (otherlv_2= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3251:1: (otherlv_2= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3251:1: (otherlv_2= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3252:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7398); 

            		newLeafNode(otherlv_2, grammarAccess.getNAryMaterialRelationAccess().getDerivedFromRelatorUniversalCrossReference_2_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3263:2: ( (lv_name_3_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3264:1: (lv_name_3_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3264:1: (lv_name_3_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3265:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7415); 

            			newLeafNode(lv_name_3_0, grammarAccess.getNAryMaterialRelationAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3281:2: ( ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3281:3: ( (otherlv_4= RULE_ID ) ) (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3281:3: ( (otherlv_4= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3282:1: (otherlv_4= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3282:1: (otherlv_4= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3283:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7441); 

                    		newLeafNode(otherlv_4, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_0_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3294:2: (otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3294:4: otherlv_5= '[' ( (lv_sourceLowerBound_6_0= ruleEInt ) ) otherlv_7= '..' ( (lv_sourceUpperBound_8_0= ruleEInt ) ) otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulenAryMaterialRelation7454); 

                        	newLeafNode(otherlv_5, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3298:1: ( (lv_sourceLowerBound_6_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3299:1: (lv_sourceLowerBound_6_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3299:1: (lv_sourceLowerBound_6_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3300:3: lv_sourceLowerBound_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundEIntParserRuleCall_4_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7475);
                    lv_sourceLowerBound_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulenAryMaterialRelation7487); 

                        	newLeafNode(otherlv_7, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3320:1: ( (lv_sourceUpperBound_8_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3321:1: (lv_sourceUpperBound_8_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3321:1: (lv_sourceUpperBound_8_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3322:3: lv_sourceUpperBound_8_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundEIntParserRuleCall_4_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7508);
                    lv_sourceUpperBound_8_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_8_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryMaterialRelation7520); 

                        	newLeafNode(otherlv_9, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_1_4());
                        

                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3342:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==18) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3342:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulenAryMaterialRelation7534); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getNAryMaterialRelationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3346:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3347:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3347:1: (otherlv_11= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3348:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNAryMaterialRelationRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryMaterialRelation7554); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getNAryMaterialRelationAccess().getTargetRelataExternallyDependentUniversalCrossReference_4_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3359:4: (otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3359:6: otherlv_12= '[' ( (lv_sourceLowerBound_13_0= ruleEInt ) ) otherlv_14= '..' ( (lv_sourceUpperBound_15_0= ruleEInt ) ) otherlv_16= ']'
                    {
                    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulenAryMaterialRelation7569); 

                        	newLeafNode(otherlv_12, grammarAccess.getNAryMaterialRelationAccess().getLeftSquareBracketKeyword_4_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3363:1: ( (lv_sourceLowerBound_13_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3364:1: (lv_sourceLowerBound_13_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3364:1: (lv_sourceLowerBound_13_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3365:3: lv_sourceLowerBound_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceLowerBoundEIntParserRuleCall_4_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7590);
                    lv_sourceLowerBound_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulenAryMaterialRelation7602); 

                        	newLeafNode(otherlv_14, grammarAccess.getNAryMaterialRelationAccess().getFullStopFullStopKeyword_4_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3385:1: ( (lv_sourceUpperBound_15_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3386:1: (lv_sourceUpperBound_15_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3386:1: (lv_sourceUpperBound_15_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3387:3: lv_sourceUpperBound_15_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryMaterialRelationAccess().getSourceUpperBoundEIntParserRuleCall_4_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryMaterialRelation7623);
                    lv_sourceUpperBound_15_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryMaterialRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_15_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryMaterialRelation7635); 

                        	newLeafNode(otherlv_16, grammarAccess.getNAryMaterialRelationAccess().getRightSquareBracketKeyword_4_3_4());
                        

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulenAryMaterialRelation7650); 

                	newLeafNode(otherlv_17, grammarAccess.getNAryMaterialRelationAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenAryMaterialRelation"


    // $ANTLR start "entryRulenAryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3419:1: entryRulenAryFormalRelation returns [EObject current=null] : iv_rulenAryFormalRelation= rulenAryFormalRelation EOF ;
    public final EObject entryRulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenAryFormalRelation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3420:2: (iv_rulenAryFormalRelation= rulenAryFormalRelation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3421:2: iv_rulenAryFormalRelation= rulenAryFormalRelation EOF
            {
             newCompositeNode(grammarAccess.getNAryFormalRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_rulenAryFormalRelation_in_entryRulenAryFormalRelation7686);
            iv_rulenAryFormalRelation=rulenAryFormalRelation();

            state._fsp--;

             current =iv_rulenAryFormalRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulenAryFormalRelation7696); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenAryFormalRelation"


    // $ANTLR start "rulenAryFormalRelation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3428:1: rulenAryFormalRelation returns [EObject current=null] : (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) ;
    public final EObject rulenAryFormalRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_7_0 = null;

        AntlrDatatypeRuleToken lv_sourceLowerBound_12_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_14_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3431:28: ( (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3432:1: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3432:1: (otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3432:3: otherlv_0= 'formal' otherlv_1= 'assoc' ( (lv_name_2_0= RULE_ID ) ) ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )? otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_rulenAryFormalRelation7733); 

                	newLeafNode(otherlv_0, grammarAccess.getNAryFormalRelationAccess().getFormalKeyword_0());
                
            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_rulenAryFormalRelation7745); 

                	newLeafNode(otherlv_1, grammarAccess.getNAryFormalRelationAccess().getAssocKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3440:1: ( (lv_name_2_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3441:1: (lv_name_2_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3441:1: (lv_name_2_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3442:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation7762); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNAryFormalRelationAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3458:2: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3458:3: ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3458:3: ( (otherlv_3= RULE_ID ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3459:1: (otherlv_3= RULE_ID )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3459:1: (otherlv_3= RULE_ID )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3460:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation7788); 

                    		newLeafNode(otherlv_3, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_0_0()); 
                    	

                    }


                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3471:2: (otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3471:4: otherlv_4= '[' ( (lv_sourceLowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_sourceUpperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulenAryFormalRelation7801); 

                        	newLeafNode(otherlv_4, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3475:1: ( (lv_sourceLowerBound_5_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3476:1: (lv_sourceLowerBound_5_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3476:1: (lv_sourceLowerBound_5_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3477:3: lv_sourceLowerBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation7822);
                    lv_sourceLowerBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulenAryFormalRelation7834); 

                        	newLeafNode(otherlv_6, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3497:1: ( (lv_sourceUpperBound_7_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3498:1: (lv_sourceUpperBound_7_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3498:1: (lv_sourceUpperBound_7_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3499:3: lv_sourceUpperBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation7855);
                    lv_sourceUpperBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryFormalRelation7867); 

                        	newLeafNode(otherlv_8, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_1_4());
                        

                    }

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3519:2: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==18) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3519:4: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulenAryFormalRelation7881); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getNAryFormalRelationAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3523:1: ( (otherlv_10= RULE_ID ) )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3524:1: (otherlv_10= RULE_ID )
                    	    {
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3524:1: (otherlv_10= RULE_ID )
                    	    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3525:3: otherlv_10= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNAryFormalRelationRule());
                    	    	        }
                    	            
                    	    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulenAryFormalRelation7901); 

                    	    		newLeafNode(otherlv_10, grammarAccess.getNAryFormalRelationAccess().getTargetRelataUniversalCrossReference_3_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3536:4: (otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']' )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3536:6: otherlv_11= '[' ( (lv_sourceLowerBound_12_0= ruleEInt ) ) otherlv_13= '..' ( (lv_sourceUpperBound_14_0= ruleEInt ) ) otherlv_15= ']'
                    {
                    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulenAryFormalRelation7916); 

                        	newLeafNode(otherlv_11, grammarAccess.getNAryFormalRelationAccess().getLeftSquareBracketKeyword_3_3_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3540:1: ( (lv_sourceLowerBound_12_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3541:1: (lv_sourceLowerBound_12_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3541:1: (lv_sourceLowerBound_12_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3542:3: lv_sourceLowerBound_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceLowerBoundEIntParserRuleCall_3_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation7937);
                    lv_sourceLowerBound_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulenAryFormalRelation7949); 

                        	newLeafNode(otherlv_13, grammarAccess.getNAryFormalRelationAccess().getFullStopFullStopKeyword_3_3_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3562:1: ( (lv_sourceUpperBound_14_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3563:1: (lv_sourceUpperBound_14_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3563:1: (lv_sourceUpperBound_14_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3564:3: lv_sourceUpperBound_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNAryFormalRelationAccess().getSourceUpperBoundEIntParserRuleCall_3_3_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulenAryFormalRelation7970);
                    lv_sourceUpperBound_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNAryFormalRelationRule());
                    	        }
                           		add(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulenAryFormalRelation7982); 

                        	newLeafNode(otherlv_15, grammarAccess.getNAryFormalRelationAccess().getRightSquareBracketKeyword_3_3_4());
                        

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulenAryFormalRelation7997); 

                	newLeafNode(otherlv_16, grammarAccess.getNAryFormalRelationAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenAryFormalRelation"


    // $ANTLR start "entryRuleEString"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3596:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3597:2: (iv_ruleEString= ruleEString EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3598:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString8034);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString8045); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3605:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3608:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3609:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3609:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ID) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3609:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString8085); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3617:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString8111); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePrimitiveDataTypeType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3634:1: entryRulePrimitiveDataTypeType returns [String current=null] : iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF ;
    public final String entryRulePrimitiveDataTypeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveDataTypeType = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3635:2: (iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3636:2: iv_rulePrimitiveDataTypeType= rulePrimitiveDataTypeType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveDataTypeTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimitiveDataTypeType_in_entryRulePrimitiveDataTypeType8159);
            iv_rulePrimitiveDataTypeType=rulePrimitiveDataTypeType();

            state._fsp--;

             current =iv_rulePrimitiveDataTypeType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimitiveDataTypeType8170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDataTypeType"


    // $ANTLR start "rulePrimitiveDataTypeType"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3643:1: rulePrimitiveDataTypeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PrimitiveDataTypeType' ;
    public final AntlrDatatypeRuleToken rulePrimitiveDataTypeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3646:28: (kw= 'PrimitiveDataTypeType' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3648:2: kw= 'PrimitiveDataTypeType'
            {
            kw=(Token)match(input,57,FollowSets000.FOLLOW_57_in_rulePrimitiveDataTypeType8207); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPrimitiveDataTypeTypeAccess().getPrimitiveDataTypeTypeKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDataTypeType"


    // $ANTLR start "entryRuleDataTypeAttribute"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3661:1: entryRuleDataTypeAttribute returns [EObject current=null] : iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF ;
    public final EObject entryRuleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeAttribute = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3662:2: (iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3663:2: iv_ruleDataTypeAttribute= ruleDataTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getDataTypeAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypeAttribute_in_entryRuleDataTypeAttribute8246);
            iv_ruleDataTypeAttribute=ruleDataTypeAttribute();

            state._fsp--;

             current =iv_ruleDataTypeAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataTypeAttribute8256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeAttribute"


    // $ANTLR start "ruleDataTypeAttribute"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3670:1: ruleDataTypeAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3673:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3674:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3674:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3674:2: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3674:2: ( (otherlv_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3675:1: (otherlv_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3675:1: (otherlv_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3676:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeAttribute8301); 

            		newLeafNode(otherlv_0, grammarAccess.getDataTypeAttributeAccess().getIsOfTypeDataTypeCrossReference_0_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3687:2: ( (lv_name_1_0= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3688:1: (lv_name_1_0= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3688:1: (lv_name_1_0= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3689:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataTypeAttribute8318); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeAttribute"


    // $ANTLR start "entryRuleEInt"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3713:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3714:2: (iv_ruleEInt= ruleEInt EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3715:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8360);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3722:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3725:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3726:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3726:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3726:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3726:2: (kw= '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3727:2: kw= '-'
                    {
                    kw=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEInt8410); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8427); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleCharacterization"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3747:1: entryRuleCharacterization returns [EObject current=null] : iv_ruleCharacterization= ruleCharacterization EOF ;
    public final EObject entryRuleCharacterization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterization = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3748:2: (iv_ruleCharacterization= ruleCharacterization EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3749:2: iv_ruleCharacterization= ruleCharacterization EOF
            {
             newCompositeNode(grammarAccess.getCharacterizationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCharacterization_in_entryRuleCharacterization8472);
            iv_ruleCharacterization=ruleCharacterization();

            state._fsp--;

             current =iv_ruleCharacterization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCharacterization8482); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharacterization"


    // $ANTLR start "ruleCharacterization"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3756:1: ruleCharacterization returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleCharacterization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_4_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3759:28: ( ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3760:1: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3760:1: ( () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3760:2: () (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )? otherlv_6= 'characterizedBy' ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3760:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3761:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharacterizationAccess().getCharacterizationAction_0(),
                        current);
                

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3766:2: (otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==30) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3766:4: otherlv_1= '[' ( (lv_sourceLowerBound_2_0= ruleEInt ) ) otherlv_3= '..' ( (lv_sourceUpperBound_4_0= ruleEInt ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCharacterization8529); 

                        	newLeafNode(otherlv_1, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3770:1: ( (lv_sourceLowerBound_2_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3771:1: (lv_sourceLowerBound_2_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3771:1: (lv_sourceLowerBound_2_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3772:3: lv_sourceLowerBound_2_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceLowerBoundEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization8550);
                    lv_sourceLowerBound_2_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_2_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCharacterization8562); 

                        	newLeafNode(otherlv_3, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_1_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3792:1: ( (lv_sourceUpperBound_4_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3793:1: (lv_sourceUpperBound_4_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3793:1: (lv_sourceUpperBound_4_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3794:3: lv_sourceUpperBound_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getSourceUpperBoundEIntParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization8583);
                    lv_sourceUpperBound_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacterization8595); 

                        	newLeafNode(otherlv_5, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_1_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleCharacterization8609); 

                	newLeafNode(otherlv_6, grammarAccess.getCharacterizationAccess().getCharacterizedByKeyword_2());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3818:1: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3819:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3819:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3820:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterizationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCharacterization8629); 

            		newLeafNode(otherlv_7, grammarAccess.getCharacterizationAccess().getTargetIntrinsicMomentUniversalCrossReference_3_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3831:2: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3831:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCharacterization8642); 

                        	newLeafNode(otherlv_8, grammarAccess.getCharacterizationAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3835:1: ( (lv_targetLowerBound_9_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3836:1: (lv_targetLowerBound_9_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3836:1: (lv_targetLowerBound_9_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3837:3: lv_targetLowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization8663);
                    lv_targetLowerBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCharacterization8675); 

                        	newLeafNode(otherlv_10, grammarAccess.getCharacterizationAccess().getFullStopFullStopKeyword_4_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3857:1: ( (lv_targetUpperBound_11_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3858:1: (lv_targetUpperBound_11_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3858:1: (lv_targetUpperBound_11_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3859:3: lv_targetUpperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharacterizationAccess().getTargetUpperBoundEIntParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleCharacterization8696);
                    lv_targetUpperBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharacterizationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCharacterization8708); 

                        	newLeafNode(otherlv_12, grammarAccess.getCharacterizationAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCharacterization8722); 

                	newLeafNode(otherlv_13, grammarAccess.getCharacterizationAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharacterization"


    // $ANTLR start "entryRuleMediation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3891:1: entryRuleMediation returns [EObject current=null] : iv_ruleMediation= ruleMediation EOF ;
    public final EObject entryRuleMediation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMediation = null;


        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3892:2: (iv_ruleMediation= ruleMediation EOF )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3893:2: iv_ruleMediation= ruleMediation EOF
            {
             newCompositeNode(grammarAccess.getMediationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMediation_in_entryRuleMediation8758);
            iv_ruleMediation=ruleMediation();

            state._fsp--;

             current =iv_ruleMediation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMediation8768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMediation"


    // $ANTLR start "ruleMediation"
    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3900:1: ruleMediation returns [EObject current=null] : ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) ;
    public final EObject ruleMediation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sourceLowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_sourceUpperBound_5_0 = null;

        AntlrDatatypeRuleToken lv_targetLowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_targetUpperBound_11_0 = null;


         enterRule(); 
            
        try {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3903:28: ( ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3904:1: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3904:1: ( () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';' )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3904:2: () otherlv_1= 'mediates' (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )? ( (otherlv_7= RULE_ID ) ) (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )? otherlv_13= ';'
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3904:2: ()
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3905:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMediationAccess().getMediationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleMediation8814); 

                	newLeafNode(otherlv_1, grammarAccess.getMediationAccess().getMediatesKeyword_1());
                
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3914:1: (otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==30) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3914:3: otherlv_2= '[' ( (lv_sourceLowerBound_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_sourceUpperBound_5_0= ruleEInt ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMediation8827); 

                        	newLeafNode(otherlv_2, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3918:1: ( (lv_sourceLowerBound_3_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3919:1: (lv_sourceLowerBound_3_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3919:1: (lv_sourceLowerBound_3_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3920:3: lv_sourceLowerBound_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getSourceLowerBoundEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation8848);
                    lv_sourceLowerBound_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceLowerBound",
                            		lv_sourceLowerBound_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMediation8860); 

                        	newLeafNode(otherlv_4, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_2_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3940:1: ( (lv_sourceUpperBound_5_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3941:1: (lv_sourceUpperBound_5_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3941:1: (lv_sourceUpperBound_5_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3942:3: lv_sourceUpperBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getSourceUpperBoundEIntParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation8881);
                    lv_sourceUpperBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"sourceUpperBound",
                            		lv_sourceUpperBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMediation8893); 

                        	newLeafNode(otherlv_6, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_2_4());
                        

                    }
                    break;

            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3962:3: ( (otherlv_7= RULE_ID ) )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3963:1: (otherlv_7= RULE_ID )
            {
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3963:1: (otherlv_7= RULE_ID )
            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3964:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMediationRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMediation8915); 

            		newLeafNode(otherlv_7, grammarAccess.getMediationAccess().getTargetExternallyDependentUniversalCrossReference_3_0()); 
            	

            }


            }

            // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3975:2: (otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3975:4: otherlv_8= '[' ( (lv_targetLowerBound_9_0= ruleEInt ) ) otherlv_10= '..' ( (lv_targetUpperBound_11_0= ruleEInt ) ) otherlv_12= ']'
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMediation8928); 

                        	newLeafNode(otherlv_8, grammarAccess.getMediationAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3979:1: ( (lv_targetLowerBound_9_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3980:1: (lv_targetLowerBound_9_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3980:1: (lv_targetLowerBound_9_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:3981:3: lv_targetLowerBound_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getTargetLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation8949);
                    lv_targetLowerBound_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetLowerBound",
                            		lv_targetLowerBound_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMediation8961); 

                        	newLeafNode(otherlv_10, grammarAccess.getMediationAccess().getFullStopFullStopKeyword_4_2());
                        
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4001:1: ( (lv_targetUpperBound_11_0= ruleEInt ) )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4002:1: (lv_targetUpperBound_11_0= ruleEInt )
                    {
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4002:1: (lv_targetUpperBound_11_0= ruleEInt )
                    // ../br.ufes.inf.nemo.ontouml.ontoumlprime.dsl/src-gen/br/ufes/inf/nemo/ontouml/ontoumlprime/parser/antlr/internal/InternalDsl.g:4003:3: lv_targetUpperBound_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getMediationAccess().getTargetUpperBoundEIntParserRuleCall_4_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMediation8982);
                    lv_targetUpperBound_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMediationRule());
                    	        }
                           		set(
                           			current, 
                           			"targetUpperBound",
                            		lv_targetUpperBound_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMediation8994); 

                        	newLeafNode(otherlv_12, grammarAccess.getMediationAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMediation9008); 

                	newLeafNode(otherlv_13, grammarAccess.getMediationAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMediation"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA2_eotS =
        "\31\uffff";
    static final String DFA2_eofS =
        "\31\uffff";
    static final String DFA2_minS =
        "\1\13\20\uffff\2\61\6\uffff";
    static final String DFA2_maxS =
        "\1\65\20\uffff\2\70\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\2\uffff\1\23\1\24\1\25\1\21\1\22\1\26";
    static final String DFA2_specialS =
        "\31\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\2\uffff\2\2\4\uffff\1\3\2\uffff\1\4\1\5\4\6\10\uffff\1"+
            "\7\1\10\2\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\2\uffff"+
            "\1\22\1\23\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\6\uffff\1\25",
            "\1\27\6\uffff\1\30",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "125:1: (this_Package_0= rulePackage | this_GeneralizationSet_1= ruleGeneralizationSet | this_PrimitiveDataType_2= rulePrimitiveDataType | this_ComplexDataType_3= ruleComplexDataType | this_Enumeration_4= ruleEnumeration | this_MeronymicRelation_5= ruleMeronymicRelation | this_Kind_6= ruleKind | this_QuantityUniversal_7= ruleQuantityUniversal | this_CollectiveUniversal_8= ruleCollectiveUniversal | this_SubKind_9= ruleSubKind | this_Role_10= ruleRole | this_Phase_11= rulePhase | this_Category_12= ruleCategory | this_Mixin_13= ruleMixin | this_RoleMixin_14= ruleRoleMixin | this_RelatorUniversal_15= ruleRelatorUniversal | this_BinaryMaterialRelation_16= ruleBinaryMaterialRelation | this_BinaryFormalRelation_17= ruleBinaryFormalRelation | this_ModeUniversal_18= ruleModeUniversal | this_QualityUniversal_19= ruleQualityUniversal | this_nAryMaterialRelation_20= rulenAryMaterialRelation | this_nAryFormalRelation_21= rulenAryFormalRelation )";
        }
    }
    static final String DFA8_eotS =
        "\36\uffff";
    static final String DFA8_eofS =
        "\36\uffff";
    static final String DFA8_minS =
        "\5\31\2\4\3\31\2\36\1\6\4\uffff\2\6\1\37\1\6\1\37\3\6\1\40\1\6\1"+
        "\40\2\41";
    static final String DFA8_maxS =
        "\1\34\4\35\2\4\3\35\1\44\1\43\1\72\4\uffff\1\72\1\6\1\37\1\6\1\37"+
        "\2\72\1\6\1\40\1\6\1\40\1\44\1\43";
    static final String DFA8_acceptS =
        "\15\uffff\1\4\1\2\1\3\1\1\15\uffff";
    static final String DFA8_specialS =
        "\36\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2\1\3\1\4",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\12",
            "\1\13",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\7\1\10\1\3\1\11\1\6",
            "\1\14\2\uffff\1\20\1\16\1\17\1\15",
            "\1\21\2\uffff\1\20\1\16\1\17",
            "\1\23\63\uffff\1\22",
            "",
            "",
            "",
            "",
            "\1\25\63\uffff\1\24",
            "\1\23",
            "\1\26",
            "\1\25",
            "\1\27",
            "\1\31\63\uffff\1\30",
            "\1\33\63\uffff\1\32",
            "\1\31",
            "\1\34",
            "\1\33",
            "\1\35",
            "\1\20\1\16\1\17\1\15",
            "\1\20\1\16\1\17"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "816:1: (this_ComponentOfRelation_0= ruleComponentOfRelation | this_MembershipRelation_1= ruleMembershipRelation | this_SubCollectionRelation_2= ruleSubCollectionRelation | this_SubQuantityRelation_3= ruleSubQuantityRelation )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleModel140 = new BitSet(new long[]{0x0039FFE01F90C802L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_ruleElement234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_ruleElement261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataType_in_ruleElement288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexDataType_in_ruleElement315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_ruleElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeronymicRelation_in_ruleElement369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_ruleElement396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantityUniversal_in_ruleElement423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectiveUniversal_in_ruleElement450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_ruleElement477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_ruleElement504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_ruleElement531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleElement558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_ruleElement585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_ruleElement612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelatorUniversal_in_ruleElement639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryMaterialRelation_in_ruleElement666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormalRelation_in_ruleElement693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModeUniversal_in_ruleElement720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualityUniversal_in_ruleElement747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryMaterialRelation_in_ruleElement774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryFormalRelation_in_ruleElement801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage900 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePackage917 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage934 = new BitSet(new long[]{0x0039FFE01F90E800L});
        public static final BitSet FOLLOW_ruleElement_in_rulePackage955 = new BitSet(new long[]{0x0039FFE01F90E800L});
        public static final BitSet FOLLOW_13_in_rulePackage968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGeneralizationSet_in_entryRuleGeneralizationSet1004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGeneralizationSet1014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleGeneralizationSet1057 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGeneralizationSet1083 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralizationSet1100 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGeneralizationSet1117 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralizationSet1137 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleGeneralizationSet1149 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralizationSet1169 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleGeneralizationSet1182 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralizationSet1202 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_19_in_ruleGeneralizationSet1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataType_in_entryRulePrimitiveDataType1252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataType1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulePrimitiveDataType1299 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveDataType1316 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_rulePrimitiveDataType1333 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_rulePrimitiveDataTypeType_in_rulePrimitiveDataType1354 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePrimitiveDataType1366 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulePrimitiveDataType1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComplexDataType_in_entryRuleComplexDataType1414 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComplexDataType1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleComplexDataType1461 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComplexDataType1478 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleComplexDataType1495 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1516 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_19_in_ruleComplexDataType1529 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_ruleComplexDataType1550 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_13_in_ruleComplexDataType1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1600 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEnumeration1647 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1664 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEnumeration1681 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumeration1702 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_18_in_ruleEnumeration1715 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleEnumeration1736 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_13_in_ruleEnumeration1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMeronymicRelation_in_entryRuleMeronymicRelation1786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMeronymicRelation1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentOfRelation_in_ruleMeronymicRelation1843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMembershipRelation_in_ruleMeronymicRelation1870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubCollectionRelation_in_ruleMeronymicRelation1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubQuantityRelation_in_ruleMeronymicRelation1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentOfRelation_in_entryRuleComponentOfRelation1959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentOfRelation1969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleComponentOfRelation2057 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_26_in_ruleComponentOfRelation2142 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_27_in_ruleComponentOfRelation2227 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_28_in_ruleComponentOfRelation2312 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_29_in_ruleComponentOfRelation2383 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentOfRelation2403 = new BitSet(new long[]{0x0000000240000000L});
        public static final BitSet FOLLOW_30_in_ruleComponentOfRelation2416 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2437 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentOfRelation2449 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2470 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleComponentOfRelation2482 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleComponentOfRelation2496 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComponentOfRelation2516 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleComponentOfRelation2529 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2550 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleComponentOfRelation2562 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleComponentOfRelation2583 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleComponentOfRelation2595 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleComponentOfRelation2609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMembershipRelation_in_entryRuleMembershipRelation2645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMembershipRelation2655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleMembershipRelation2743 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_26_in_ruleMembershipRelation2828 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_27_in_ruleMembershipRelation2913 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_28_in_ruleMembershipRelation2998 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_29_in_ruleMembershipRelation3069 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMembershipRelation3089 = new BitSet(new long[]{0x0000000440000000L});
        public static final BitSet FOLLOW_30_in_ruleMembershipRelation3102 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3123 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMembershipRelation3135 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3156 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMembershipRelation3168 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleMembershipRelation3182 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMembershipRelation3202 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleMembershipRelation3215 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3236 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMembershipRelation3248 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMembershipRelation3269 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMembershipRelation3281 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMembershipRelation3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubCollectionRelation_in_entryRuleSubCollectionRelation3331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubCollectionRelation3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSubCollectionRelation3429 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_26_in_ruleSubCollectionRelation3514 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_27_in_ruleSubCollectionRelation3599 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_28_in_ruleSubCollectionRelation3684 = new BitSet(new long[]{0x000000003E000000L});
        public static final BitSet FOLLOW_29_in_ruleSubCollectionRelation3755 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubCollectionRelation3775 = new BitSet(new long[]{0x0000000840000000L});
        public static final BitSet FOLLOW_30_in_ruleSubCollectionRelation3788 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation3809 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSubCollectionRelation3821 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation3842 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubCollectionRelation3854 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleSubCollectionRelation3868 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubCollectionRelation3888 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleSubCollectionRelation3901 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation3922 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSubCollectionRelation3934 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubCollectionRelation3955 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubCollectionRelation3967 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubCollectionRelation3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubQuantityRelation_in_entryRuleSubQuantityRelation4017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubQuantityRelation4027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleSubQuantityRelation4115 = new BitSet(new long[]{0x0000000036000000L});
        public static final BitSet FOLLOW_26_in_ruleSubQuantityRelation4200 = new BitSet(new long[]{0x0000000036000000L});
        public static final BitSet FOLLOW_28_in_ruleSubQuantityRelation4285 = new BitSet(new long[]{0x0000000036000000L});
        public static final BitSet FOLLOW_29_in_ruleSubQuantityRelation4356 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubQuantityRelation4376 = new BitSet(new long[]{0x0000001040000000L});
        public static final BitSet FOLLOW_30_in_ruleSubQuantityRelation4389 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4410 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSubQuantityRelation4422 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4443 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubQuantityRelation4455 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleSubQuantityRelation4469 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubQuantityRelation4489 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleSubQuantityRelation4502 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4523 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSubQuantityRelation4535 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSubQuantityRelation4556 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubQuantityRelation4568 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSubQuantityRelation4582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKind_in_entryRuleKind4618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKind4628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleKind4674 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKind4691 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleKind4708 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleKind4729 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleKind4742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuantityUniversal_in_entryRuleQuantityUniversal4778 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuantityUniversal4788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleQuantityUniversal4834 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQuantityUniversal4851 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQuantityUniversal4868 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleQuantityUniversal4889 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleQuantityUniversal4902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCollectiveUniversal_in_entryRuleCollectiveUniversal4938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCollectiveUniversal4948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleCollectiveUniversal4991 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleCollectiveUniversal5017 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCollectiveUniversal5034 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCollectiveUniversal5051 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleCollectiveUniversal5072 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleCollectiveUniversal5085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubKind_in_entryRuleSubKind5121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubKind5131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSubKind5177 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubKind5194 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSubKind5211 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleSubKind5232 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleSubKind5245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRole_in_entryRuleRole5281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRole5291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleRole5328 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRole5345 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRole5362 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleRole5383 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleRole5396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePhase_in_entryRulePhase5432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePhase5442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rulePhase5488 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePhase5505 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePhase5522 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_rulePhase5543 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_rulePhase5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory5592 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCategory5602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleCategory5648 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCategory5665 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCategory5682 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCategory5694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin5730 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMixin5740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleMixin5786 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMixin5803 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMixin5820 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMixin5832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRoleMixin_in_entryRuleRoleMixin5868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoleMixin5878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleRoleMixin5915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRoleMixin5932 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRoleMixin5949 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRoleMixin5961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelatorUniversal_in_entryRuleRelatorUniversal5997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelatorUniversal6007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleRelatorUniversal6044 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelatorUniversal6061 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRelatorUniversal6078 = new BitSet(new long[]{0x1800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleRelatorUniversal6099 = new BitSet(new long[]{0x1800000040002000L});
        public static final BitSet FOLLOW_ruleMediation_in_ruleRelatorUniversal6121 = new BitSet(new long[]{0x1000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRelatorUniversal6134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryMaterialRelation_in_entryRuleBinaryMaterialRelation6170 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryMaterialRelation6180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleBinaryMaterialRelation6217 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleBinaryMaterialRelation6229 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6249 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_30_in_ruleBinaryMaterialRelation6262 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6283 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBinaryMaterialRelation6295 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6316 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryMaterialRelation6328 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6347 = new BitSet(new long[]{0x0004000000200000L});
        public static final BitSet FOLLOW_21_in_ruleBinaryMaterialRelation6365 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6385 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleBinaryMaterialRelation6397 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleBinaryMaterialRelation6411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryMaterialRelation6431 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleBinaryMaterialRelation6444 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6465 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBinaryMaterialRelation6477 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryMaterialRelation6498 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryMaterialRelation6510 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBinaryMaterialRelation6524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinaryFormalRelation_in_entryRuleBinaryFormalRelation6560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinaryFormalRelation6570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleBinaryFormalRelation6607 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleBinaryFormalRelation6619 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6639 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_30_in_ruleBinaryFormalRelation6652 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6673 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBinaryFormalRelation6685 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6706 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryFormalRelation6718 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6737 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinaryFormalRelation6762 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleBinaryFormalRelation6775 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6796 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleBinaryFormalRelation6808 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleBinaryFormalRelation6829 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleBinaryFormalRelation6841 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleBinaryFormalRelation6855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModeUniversal_in_entryRuleModeUniversal6891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModeUniversal6901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleModeUniversal6938 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModeUniversal6955 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModeUniversal6972 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleModeUniversal6993 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleModeUniversal7006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualityUniversal_in_entryRuleQualityUniversal7042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualityUniversal7052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleQualityUniversal7089 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7106 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleQualityUniversal7123 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleQualityUniversal7155 = new BitSet(new long[]{0x0880000040002000L});
        public static final BitSet FOLLOW_55_in_ruleQualityUniversal7168 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleQualityUniversal7180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7200 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_18_in_ruleQualityUniversal7213 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualityUniversal7233 = new BitSet(new long[]{0x0000000000440000L});
        public static final BitSet FOLLOW_22_in_ruleQualityUniversal7247 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_ruleCharacterization_in_ruleQualityUniversal7270 = new BitSet(new long[]{0x0800000040002000L});
        public static final BitSet FOLLOW_13_in_ruleQualityUniversal7283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryMaterialRelation_in_entryRulenAryMaterialRelation7319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenAryMaterialRelation7329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rulenAryMaterialRelation7366 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_rulenAryMaterialRelation7378 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7398 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7415 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7441 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulenAryMaterialRelation7454 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7475 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulenAryMaterialRelation7487 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7508 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryMaterialRelation7520 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_18_in_rulenAryMaterialRelation7534 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryMaterialRelation7554 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_30_in_rulenAryMaterialRelation7569 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7590 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulenAryMaterialRelation7602 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryMaterialRelation7623 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryMaterialRelation7635 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulenAryMaterialRelation7650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulenAryFormalRelation_in_entryRulenAryFormalRelation7686 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulenAryFormalRelation7696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_rulenAryFormalRelation7733 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_rulenAryFormalRelation7745 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation7762 = new BitSet(new long[]{0x0000000000080010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation7788 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_rulenAryFormalRelation7801 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation7822 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulenAryFormalRelation7834 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation7855 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryFormalRelation7867 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_18_in_rulenAryFormalRelation7881 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulenAryFormalRelation7901 = new BitSet(new long[]{0x0000000040040000L});
        public static final BitSet FOLLOW_30_in_rulenAryFormalRelation7916 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation7937 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_rulenAryFormalRelation7949 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulenAryFormalRelation7970 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulenAryFormalRelation7982 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_rulenAryFormalRelation7997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString8034 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString8045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString8085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString8111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimitiveDataTypeType_in_entryRulePrimitiveDataTypeType8159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDataTypeType8170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_rulePrimitiveDataTypeType8207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypeAttribute_in_entryRuleDataTypeAttribute8246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeAttribute8256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeAttribute8301 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeAttribute8318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleEInt8410 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCharacterization_in_entryRuleCharacterization8472 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCharacterization8482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCharacterization8529 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization8550 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCharacterization8562 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization8583 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCharacterization8595 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_59_in_ruleCharacterization8609 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterization8629 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleCharacterization8642 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization8663 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCharacterization8675 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleCharacterization8696 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCharacterization8708 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleCharacterization8722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMediation_in_entryRuleMediation8758 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMediation8768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleMediation8814 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_30_in_ruleMediation8827 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation8848 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMediation8860 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation8881 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMediation8893 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMediation8915 = new BitSet(new long[]{0x0000000040080000L});
        public static final BitSet FOLLOW_30_in_ruleMediation8928 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation8949 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMediation8961 = new BitSet(new long[]{0x0400000000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMediation8982 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMediation8994 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleMediation9008 = new BitSet(new long[]{0x0000000000000002L});
    }


}